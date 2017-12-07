package cc.dc.net;

public class RequestConnect {

    public void performRequest(Request request) {
        try {
            Thread.sleep(100);
            if (request.getName().equals("0")) {
                System.out.println(Thread.currentThread().getName() + "--->" + request.getName() + "---" + request.getUrl());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
