package cc.dc.future;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestDemo {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,
                10, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(5));

        for (int  i = 0; i < 20;i ++) {
            MyRunnable task = new MyRunnable(i);
            executor.execute(task);
            System.out.println("线程池中的线程数量" + executor.getPoolSize()
                + "---队列中等待的数量-->" + executor.getQueue().size()
                + "----执行完的数量-->" + executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }


    static class MyRunnable implements Runnable {
        private int taskNum;

        public MyRunnable(int taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public void run() {
            System.out.println("正在执行-->" + taskNum);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行完毕-->" + taskNum);
        }
    }
}
