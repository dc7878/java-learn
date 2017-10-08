package cc.dc.thread;

public class Consumer extends Thread {

    private Resource resource;

    public Consumer(String name, Resource resource) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resource.remove();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
