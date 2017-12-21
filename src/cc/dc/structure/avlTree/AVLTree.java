package cc.dc.structure.avlTree;

public class AVLTree {

    private AVLTreeNode root;

    public int height() {
        return height(root);
    }

    private int height(AVLTreeNode node) {
        if (node != null) {
            return node.height;
        }
        return 0;
    }

    public void insert(int data) {
        root = insert(root, data);
    }
    private AVLTreeNode insert(AVLTreeNode node, int data) {
        if (root == null) {
            return root = new AVLTreeNode(data, null, null);
        }
        if (data > node.data) {
            // 插到右子树
            node.right = insert(node.right, data);
        } else if (data < node.data) {
            // 插到左子树
            node.left = insert(node.left, data);
        }
        return balance(node);
    }

    // 再平衡
    private AVLTreeNode balance(AVLTreeNode node) {
        return null;
    }
}
