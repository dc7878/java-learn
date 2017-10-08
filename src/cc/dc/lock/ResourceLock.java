package cc.dc.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceLock {

    private int size = 0;

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void add() throws InterruptedException {
        lock.lock();
        try {
            while (size > 0) {
                condition.await();
            }
            size++;
            System.out.println("生产->" + System.currentTimeMillis() / 100 + size);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void remove() throws InterruptedException {
        lock.lock();
        try {
            while (size <= 0) {
                condition.await();
            }
            System.out.println("消费->" + System.currentTimeMillis() / 100 + size);
            size--;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
