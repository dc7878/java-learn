package cc.dc.algorithm.newcow;

import cc.dc.structure.tree.BinaryTreeNode;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 */
public class day03_1228 {

    private static boolean isBalanced = true;

    private static boolean IsBalanced_Solution(BinaryTreeNode node) {
        getTreeHeight(node);
        return false;
    }

    private static int getTreeHeight(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = getTreeHeight(node.getLeftNode());
        int right = getTreeHeight(node.getRightNode());
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }

        return left > right ? left + 1 : right +1;
    }
}
