package cc.dc.thread.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadLocalTest {

    private static ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

    }

    private static class MyThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                local.set(i);
                System.out.println(Thread.currentThread().getName() + ">>>" +local.get());
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
            }
        }
    }
}
