package cc.dc.thread.test5;

import java.util.concurrent.Semaphore;

public class TestRunnable extends Thread {

    private int sleepTime;

    private Semaphore semaphore;

    public TestRunnable(int sleepTime, Semaphore semaphore) {
        this.sleepTime = sleepTime;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "获取了信号量>>>");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + "释放了信号量");
        }
    }
}
