package cc.dc.thread.test4;

import java.util.concurrent.locks.ReentrantLock;

public class TestDemo {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        TestThread thread1 = new TestThread(lock);
        TestThread thread2 = new TestThread(lock);
        TestThread thread3 = new TestThread(lock);
        TestThread thread4 = new TestThread(lock);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
