package cc.dc.thread;

public class Producer extends Thread {

    private Resource resource;

    public Producer(String name, Resource resource) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resource.add();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}