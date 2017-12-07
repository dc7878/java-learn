package cc.dc.net;

import java.util.Random;

/**
 * 简单模拟Volley进行网络请求
 */
public class NetTest {
    static NetManager netManager;

    public static void main(String[] args) {
        netManager = new NetManager(4);
        netManager.start();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            TestThread testThread = new TestThread(String.valueOf(i), random.nextInt(30) + 20);
            testThread.start();
        }
    }

    static class TestThread extends Thread {

        private int count;
        private Random random;
        private String name;

        public TestThread(String name, int count) {
            super(name);
            this.name = name;
            this.count = count;
            random = new Random();
        }

        @Override
        public void run() {
            while (count > 0) {
                netManager.addRequest(new Request(name, "--->" + count));
                count--;
                try {
                    Thread.sleep(random.nextInt(100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
