package cc.dc.thread;

public class TestDemo {

    public static void main(String[] args) {
        Resource resource = new Resource();

        Producer producer = new Producer("producer1", resource);
        producer.start();
        Producer producer2 = new Producer("producer2", resource);
        producer2.start();

        Consumer consumer = new Consumer("consumer1", resource);
        consumer.start();
        Consumer consumer2 = new Consumer("consumer2", resource);
        consumer2.start();
    }
}
