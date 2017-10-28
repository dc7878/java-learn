package cc.dc.structure.stack;

public class Stack {

    private int size;

    private Object[] objects;

    public Stack() {
        this.objects = new Object[10];
    }

    public Object pop() {
        size--;
        Object object = objects[size];
        return object;
    }

    public void push(Object object) {
        objects[size] = object;
        size++;
    }

    public int size() {
        return size;
    }
}
