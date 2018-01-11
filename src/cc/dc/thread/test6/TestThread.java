package cc.dc.thread.test6;

import java.util.concurrent.Callable;

public class TestThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("开始睡眠-->" + System.currentTimeMillis());
        Thread.sleep(10000);
        return "123";
    }
}
