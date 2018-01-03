package cc.dc.test;

import java.util.HashSet;

public class TestDemo3 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("测试");
//        hashSet.add("dc78781");
//        hashSet.add("什么");

        HashSet<String> hashSet2 = new HashSet<>();
//        hashSet2.add("什么");
//        hashSet2.add("测试");
//        hashSet2.add("dc78781");

        System.out.println(hashSet.containsAll(hashSet2) && hashSet2.containsAll(hashSet));
    }
}
