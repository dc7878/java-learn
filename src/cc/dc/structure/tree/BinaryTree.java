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

    /**
     * 获取树的高度
     */
    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(BinaryTreeNode node) {
        if (node == null) {
            height = 0;
        } else {
            int leftH = getHeight(node.getLeftNode());
            int rightH = getHeight(node.getRightNode());
            height = leftH > rightH ? leftH : rightH;
        }
        return height;
    }

    /**
     * 获取节点数量
     */
    public int getNodeCount() {
        return getNodeCount(root);
    }

    private int getNodeCount(BinaryTreeNode node) {
        if (node == null) {
            nodeCount = 0;
        } else {
            nodeCount = getNodeCount(node.getLeftNode()) + getNodeCount(node.getRightNode()) + 1;
        }
        return nodeCount;
    }

    public void iterateFirstOrder(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        operate(node);
        iterateFirstOrder(node.getLeftNode());
        iterateFirstOrder(node.getRightNode());
    }

    public void iterateMediumOrder(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        iterateMediumOrder(node.getLeftNode());
        operate(node);
        iterateMediumOrder(node.getRightNode());
    }

    public void iterateLastOrder(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        iterateLastOrder(node.getLeftNode());
        iterateLastOrder(node.getRightNode());
        operate(node);
    }

    private void operate(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(" " + node.getData());
    }
}
