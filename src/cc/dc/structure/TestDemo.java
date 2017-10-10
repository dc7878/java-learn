package cc.dc.structure;

public class TestDemo {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.add(0, 111);
        linkList.add(1, 2222);
        for (int i = 0; i < linkList.size(); i++) {
            System.out.println(linkList.get(i));
        }
    }
}
