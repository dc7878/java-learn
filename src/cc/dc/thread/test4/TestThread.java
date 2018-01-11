package cc.dc.thread.test4;

import java.util.concurrent.locks.ReentrantLock;

public class TestThread extends Thread {

    private ReentrantLock lock;

    public TestThread(ReentrantLock lock) {
        this.lock = lock;
        System.out.println(lock.isFair());
    }

    private void test() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + "获取锁了>>>" + lock.getHoldCount());
        test2();
        System.out.println(Thread.currentThread().getName() + "获取锁了>>>" + lock.getHoldCount());
        lock.unlock();
        System.out.println(Thread.currentThread().getName() + "释放锁了>>>" + lock.getHoldCount());
    }

    private void test2() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + "获取锁了>>>" + lock.getHoldCount());
        lock.unlock();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "运行了>>>" + lock.getHoldCount());
        test();
    }
}
