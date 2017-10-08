package cc.dc.thread.test2;

public class Data {

    public synchronized void println(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
        try {
            notifyAll();
            wait();
        } catch (Exception e) {
        }
    }
}
