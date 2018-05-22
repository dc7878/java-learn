package cc.dc.test;

public class TestDemo5 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        try {
            a = 3;
            b = 1/ 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("a = " + a);
        }
    }
}
