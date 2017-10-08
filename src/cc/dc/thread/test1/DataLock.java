package cc.dc.thread.test1;


import java.util.concurrent.locks.ReentrantLock;

public class DataLock {

    private int size = 1;

    private ReentrantLock lock = new ReentrantLock();

    public void add() {
        if (size <= 16) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() +
                        "--" + System.currentTimeMillis() / 1000 + "---" + size++);
                lock.unlock();
                Thread.sleep(1000);
            } catch (Exception e) {
            } finally {
            }
        }
    }
}
