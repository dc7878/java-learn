package cc.dc.net;

import java.util.concurrent.BlockingQueue;

public class RequestDeliver extends Thread {

    private BlockingQueue<Request> queue;

    private RequestConnect perform;

    public RequestDeliver(BlockingQueue<Request> queue) {
        this.queue = queue;

        perform = new RequestConnect();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Request request = queue.take();
                if (null != request) {
                    perform.performRequest(request);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
