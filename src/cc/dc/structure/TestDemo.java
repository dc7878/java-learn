package cc.dc.structure;

public class TestDemo {

    public static void main(String[] args) {
        Person head = null;
        Person current = null;
        Person person = new Person("dc", 12);
        head = person;
        current = head;
        System.out.println(current.getName());
        current = new Person("DC", 13);
        System.out.println(current.getName());
        System.out.println(head.getName());
    }
}
