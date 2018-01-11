package cc.dc.thread.test3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger 只能保证可见性，不保证原子性
 */
public class TestDemo {

    public static void main(String[] args) {
        AtomicInteger info = new AtomicInteger();
        TestThread thread1 = new TestThread("01", info);
        TestThread thread2 = new TestThread("02", info);

        thread1.start();
        thread2.start();
    }
}
