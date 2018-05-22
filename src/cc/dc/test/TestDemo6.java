package cc.dc.test;


import java.util.ArrayList;
import java.util.List;

public class TestDemo6 {

    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
//        String originalContent = "{\"msg\":\"info\", \"data\":[\"0\"],\"code\":\"200\"}";
//
//        int index = originalContent.indexOf("data");
//        System.out.println(index);
//        String info = originalContent.substring(index + 6, index + 7);
//        if (info.equals("[")) {
//            originalContent = originalContent.substring(0, index + 6)
//                    + "{list:"
//                    + originalContent.substring(index + 6, originalContent.length())
//            + "}";
//        }
//        System.out.println(info);
//        System.out.println(originalContent);

        test("重试1");
        test("重试2");
        test("重试3");
        test("重试4");
        test("重试5");
        test("重试6");
        test("重试7");
        test("重试4");
    }

    private static void test(String content) {
        for (int i = 0; i < list.size(); i++) {
            // 移除相同的
            if (list.get(i).equals(content)) {
                list.remove(i);
                break;
            }
        }
        if (list.size() >= 5) {
            // 移除第一条
            list.remove(list.size() - 1);
        }
        list.add(0, content);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();
    }
}
