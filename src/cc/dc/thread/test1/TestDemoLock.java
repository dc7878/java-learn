package cc.dc.thread.test1;

public class TestDemoLock {

    public static void main(String[] args) {
        DataLock dataLock = new DataLock();
        MyThreadLock myThread1 = new MyThreadLock("thread1", dataLock);
        MyThreadLock myThread2 = new MyThreadLock("thread2", dataLock);
        MyThreadLock myThread3 = new MyThreadLock("thread3", dataLock);
        MyThreadLock myThread4 = new MyThreadLock("thread4", dataLock);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
    }
}
