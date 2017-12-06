package cc.dc.threadlocal;

public class MyThread extends Thread{

    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    private void add1() {
        counter.setSize(111);
    }

    public void add2()  {
        counter.setSize(222);
    }

    @Override
    public void run() {

    }
}
