package cc.dc.test;

import java.util.HashMap;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println(Math.ceil(1.2));
        System.out.println(Math.ceil(2.01));
        System.out.println(Math.ceil(2.499));
        System.out.println(Math.ceil(2.599));
        System.out.println(Math.ceil(2.999));

        HashMap<String, Integer> map = new HashMap<>();
        map.put("01", 1111);
        map.put("00", 222);
        System.out.println(map.containsKey("00"));
        System.out.println(map.containsKey("02"));
    }
}
