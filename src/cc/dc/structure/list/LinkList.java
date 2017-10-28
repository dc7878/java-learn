package cc.dc.structure.list;

public class LinkList implements List{

    private Node head;
    private Node current;
    private int size;

    public LinkList() {
        Node node = new Node(null);
        head = current = node;
        this.size = 0;
    }

    private void add(int index) {
        if (index != -1) {
            current = head.next;
            int j = 0;
            while (current != null && j < index) {
                current = current.next;
                j++;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int index, Object obj) {
        add(index - 1);
        Node newNode = new Node(obj, current.next);
        current.setNext(newNode);
        size++;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Object get(int index) {
        current = head.next;
        int j = 0;
        while (current != null && j < index) {
            current = current.next;
            j++;
        }
        return current.getElement();
    }
}
