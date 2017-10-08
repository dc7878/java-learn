package cc.dc.thread.test2;

public class TestDemo {

    public static void main(String[] args) {
        Data data = new Data();
        MyThread1 myThread1 = new MyThread1("thread1", data);
        MyThread2 myThread2 = new MyThread2("thread2", data);

        myThread1.start();
        myThread2.start();
    }
}
