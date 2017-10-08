package cc.dc.lock;

public class ConsumerLock extends Thread {

    private ResourceLock resourceLock;

    public ConsumerLock(String name, ResourceLock resourceLock) {
        super(name);
        this.resourceLock = resourceLock;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resourceLock.remove();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
