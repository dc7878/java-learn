package cc.dc.thread.test2;

public class MyThread1 extends Thread {

    private Data data;

    public MyThread1(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            data.println(100);
        }
    }
}
