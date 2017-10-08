package cc.dc.thread.test1;

public class TestDemo {

    public static void main(String[] args) {
        Data data = new Data();
        MyThread myThread1 = new MyThread("myThread1", data);
        MyThread myThread2 = new MyThread("myThread2", data);
        MyThread myThread3 = new MyThread("myThread3", data);
        MyThread myThread4 = new MyThread("myThread4", data);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
    }
}
