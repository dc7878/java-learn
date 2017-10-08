package cc.dc.lock;

public class ProducerLock extends Thread {

    private ResourceLock resourceLock;

    public ProducerLock(String name, ResourceLock resourceLock) {
        super(name);
        this.resourceLock = resourceLock;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resourceLock.add();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
