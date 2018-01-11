package cc.dc.thread.test3;

import java.util.concurrent.atomic.AtomicInteger;

public class TestThread extends Thread {

    private AtomicInteger info;

    public TestThread(String name, AtomicInteger info) {
        super(name);
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ">>>" + info.incrementAndGet());
        }
    }
}
