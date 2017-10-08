package cc.dc.thread.test1;

public class Data {

    private int size = 1;

    public void add() throws InterruptedException {
        synchronized (this) {
            if (size <= 16) {
                System.out.println(Thread.currentThread().getName() + "-->" + size + "---" + System.currentTimeMillis() / 1000);
                size++;
                notifyAll();
            }
        }
        Thread.sleep(1000);
    }
}
