package cc.dc.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * java泛型通配符
 * http://www.cnblogs.com/xdrlczj/p/6208592.html
 */
public class TestDemo {

    public static void main(String[] args) {
        List<? extends Fruit> list = new ArrayList<Apple>();
        list.add(null);

        List<? super Fruit> list2 = new ArrayList<Fruit>();
    }
}
