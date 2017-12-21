package cc.dc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestInfo {

    private static HashMap<String, String> map;

    public static void main(String[] args) {
        map = new HashMap<>();
        map.put("index1", "info1");
        map.put("index2", "info2");
        map.put("index3", "info3");
        map.put("index4", "info4");


        Set<Map.Entry<String,String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,String> entry = iterator.next();
            System.out.print(entry.getKey() + "  ");
            System.out.println(entry.getValue());
        }
    }
}
