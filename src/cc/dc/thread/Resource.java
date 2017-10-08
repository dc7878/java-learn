package cc.dc.thread;

public class Resource {

    private int size = 0;

    public synchronized void add() throws InterruptedException {
        while (size > 0) {
            wait();
        }
        Thread.sleep(100);
        size++;
        System.out.println("生产->" + Thread.currentThread().getName() + "--" + System.currentTimeMillis() / 100  + size);
        notifyAll();
    }

    public synchronized void remove() throws InterruptedException {
        while (size <= 0) {
            wait();
        }
        Thread.sleep(100);

        System.out.println("消费->" + Thread.currentThread().getName() + "--" + System.currentTimeMillis() / 100 + size);
        size--;
        notifyAll();
    }
}
