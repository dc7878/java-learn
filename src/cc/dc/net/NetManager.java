package cc.dc.net;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class NetManager {

    private BlockingQueue<Request> queue;

    private int size;

    private RequestDeliver[] requestDelivers;

    public NetManager(int size) {
        this.queue = new PriorityBlockingQueue<>();
        this.size = size;
    }

    public void start() {
        requestDelivers = new RequestDeliver[size];
        for (int i = 0; i < size; i++) {
            requestDelivers[0] = new RequestDeliver(queue);
            requestDelivers[0].start();
        }
    }

    public void stop() {

    }

    public void addRequest(Request request) {
        queue.add(request);
    }
}
