package cc.dc.thread.test1;

public class MyThread extends Thread {

    private Data data;

    public MyThread(String name, Data data) {
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
