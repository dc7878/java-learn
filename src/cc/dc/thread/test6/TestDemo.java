package cc.dc.thread.test6;

import java.util.concurrent.*;

public class TestDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        TestThread thread = new TestThread();

        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(thread);
        service.shutdown();

//        System.out.println(future.get() + ">>>>当前oo时间>>>>" + System.currentTimeMillis());
        Thread.sleep(10000);
        System.out.println("主线程等待5s>>>" + System.currentTimeMillis());

        System.out.println(future.get() + ">>>>当前时间>>>>" + System.currentTimeMillis());
    }
}
