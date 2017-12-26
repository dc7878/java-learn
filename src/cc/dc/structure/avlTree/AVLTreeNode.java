package cc.dc.structure.avlTree;

public class AVLTreeNode {

    public int data;

    public int height;

    public AVLTreeNode left;

    public AVLTreeNode right;

    public AVLTreeNode(int data, AVLTreeNode left, AVLTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.height = -1;
    }
}
