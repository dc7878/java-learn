package cc.dc.structure.tree;

public class TestDemo {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(7);
        tree.insert(5);
        tree.insert(6);
        tree.insert(4);
        tree.insert(3);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);

        tree.iterateFirstOrder(tree.root);
        System.out.println();
        tree.iterateMiddleOrder(tree.root);
    }
}
