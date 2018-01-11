package cc.dc.test;

public class TestDemo4 {

    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
    }
}
