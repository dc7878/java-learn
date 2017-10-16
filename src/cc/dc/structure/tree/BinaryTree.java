package cc.dc.structure.tree;

public class BinaryTree {

    public BinaryTreeNode root;

    private int nodeCount;

    private int height;

    public BinaryTree() {
    }

    public BinaryTree(int data) {
        root = new BinaryTreeNode(data, null, null);
    }

    public void insert(int data) {
        if (root == null) {
            root = new BinaryTreeNode(data, null, null);
            return;
        }
        searchAndInsert(null, root, data);
    }

    private void searchAndInsert(BinaryTreeNode parent, BinaryTreeNode node, int data) {
        if (node == null) {
            node = new BinaryTreeNode();
            node.setData(data);
            if (parent != null) {
                if (data < parent.getData()) {
                    parent.setLeftNode(node);
                } else {
                    parent.setRightNode(node);
                }
            }
            return;
        }
        if (data < node.getData()) {
            searchAndInsert(node, node.getLeftNode(), data);
        } else {
            searchAndInsert(node, node.getRightNode(), data);
        }
    }

    public void iterateFirstOrder(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        operate(node);
        iterateFirstOrder(node.getLeftNode());
        iterateFirstOrder(node.getRightNode());
    }

    public void iterateMiddleOrder(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        iterateMiddleOrder(node.getLeftNode());
        operate(node);
        iterateMiddleOrder(node.getRightNode());
    }

    private void operate(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(" " + node.getData());
    }
}
