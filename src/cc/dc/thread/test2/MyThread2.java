package cc.dc.thread.test2;

public class MyThread2 extends Thread {

    private Data data;

    public MyThread2(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        for (int j = 0; j < 50; j++) {
            data.println(50);
        }
    }
}
