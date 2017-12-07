package cc.dc.net;

public class Request implements Comparable {

    private String name;

    private String url;

    private int methodType;

    public Request() {
    }

    public Request(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Request(String url, int methodType) {
        this.url = url;
        this.methodType = methodType;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
