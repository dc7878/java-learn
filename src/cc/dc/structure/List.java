package cc.dc.structure;

public interface List {

    public int size();

    public boolean isEmpty();

    public void add(int index, Object obj);

    public void remove(int index);

    public Object get(int index);
}
