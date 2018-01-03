package cc.dc.structure.avlTree;

public class AVLTree {

    private AVLTreeNode root;

    private final int ALLOWED_IMBALANCE = 1;

    public int height() {
        return height(root);
    }

    private int height(AVLTreeNode node) {
        if (node != null) {
            return node.height;
        }
        return -1;
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

    public void remove(int data) {
        remove(root, data);
    }

    private AVLTreeNode remove(AVLTreeNode node, int data) {
        if (node == null) {
            return null;
        }
        if (data > node.data) {
            return remove(node.right, data);
        } else if (data < node.data) {
            return remove(node.left, data);
        }
        return node;
    }

    /**
     * 左左旋转
     * @param k2 旋转之前的根节点
     * @return 旋转之后的根节点
     */
    private AVLTreeNode leftLeftRotation(AVLTreeNode k2) {
        AVLTreeNode k1;

        k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;

        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), k2.height) + 1;
        return k1;
    }

    /**
     * 右右旋转
     * @param k1 旋转之前的根节点
     * @return 旋转之后的根节点
     */
    private AVLTreeNode rightRightRotation(AVLTreeNode k1) {
        AVLTreeNode k2;

        k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;

        k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
        k2.height = Math.max(k1.height, height(k2.right)) + 1;

        return k2;
    }

    /**
     * 左右旋转 先右旋 然后左旋
     * @param k3 旋转之前的根节点
     * @return 旋转之后的根节点
     */
    private AVLTreeNode leftRightRotation(AVLTreeNode k3) {
        k3.left = rightRightRotation(k3.left);
        return leftLeftRotation(k3);
    }

    /**
     * 右左旋转 先左旋，然后右旋转
     * @param k3
     * @return
     */
    private AVLTreeNode rightLeft(AVLTreeNode k3) {
        k3.right = leftLeftRotation(k3.right);
        return rightRightRotation(k3);
    }

    /**
     * 再平衡
     * @param node 根节点
     * @return 平衡之后的根节点
     */
    private AVLTreeNode balance(AVLTreeNode node) {
        if (node == null) {
            return node;
        }
        if (height(node.left) - height(node.right) > ALLOWED_IMBALANCE) {
            // 左子树高度大于右子树
            if (height(node.left.left) >= height(node.left.right)) {
                leftLeftRotation(node);
            } else {
                leftRightRotation(node);
            }
        } else if (height(node.right) - height(node.left) > ALLOWED_IMBALANCE) {
            // 右子树高度大于左子树
            if (height(node.right.right) >= height(node.right.left)) {
                rightRightRotation(node);
            } else {
                rightLeft(node);
            }
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
}
