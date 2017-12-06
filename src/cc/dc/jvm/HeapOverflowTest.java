package cc.dc.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOverflowTest {
    public static void main(String[] args)
    {
//        List<HeapOverflowTest> list = new ArrayList<HeapOverflowTest>();
//        while (true)
//        {
//            list.add(new HeapOverflowTest());
//        }
        System.out.println(System.getProperty("java.vm.name"));
    }
}
