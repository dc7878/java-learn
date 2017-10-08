package cc.dc.thread.test1;

public class MyThreadLock extends Thread {

    private DataLock data;

    public MyThreadLock(String name, DataLock data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true) {
                data.add();
            }
        } catch (Exception e) {
        }
    }
}
