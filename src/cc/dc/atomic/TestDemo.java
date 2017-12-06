package cc.dc.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class TestDemo {
    private static AtomicInteger atomicInteger = new AtomicInteger() {
        @Override
        public int intValue() {
            return 20;
        }
    };

    private static int count = 0;

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }

    private static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ">>>" + atomicInteger.getAndAdd(10));
//            System.out.println(count);
//            count +=10;
        }
    }
}
