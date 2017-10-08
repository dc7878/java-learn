package cc.dc.lock;

public class TestDemoLock {

    public static void main(String[] args) {
        ResourceLock lock = new ResourceLock();
        ProducerLock producer = new ProducerLock("producer", lock);
        ConsumerLock consumer = new ConsumerLock("consumer", lock);

        producer.start();
        consumer.start();
    }
}
