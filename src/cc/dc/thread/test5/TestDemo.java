package cc.dc.thread.test5;

import cc.dc.thread.test4.TestThread;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class TestDemo {

    private static Semaphore semaphore = new Semaphore(5);

    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int sleepTime = (random.nextInt(4) + 2) * 1000;
            TestRunnable runnable = new TestRunnable(sleepTime, semaphore);
            runnable.start();
        }
    }
}
