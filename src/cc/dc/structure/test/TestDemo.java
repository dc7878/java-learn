package cc.dc.structure.test;

import cc.dc.structure.tree.BinaryTreeNode;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class TestDemo {

    static String strIn;
    static String strMe;

    public static void main(String[] args) {
        /**
         * 先: 7543698
         * 中：3456789
         * 后：3465897
         */
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while (scanner.hasNext()) {
            strIn = scanner.next();
            strMe = scanner.next();
            BinaryTreeNode node = createTree(strIn, strMe);
            listTree(node);
        }
    }

    private static BinaryTreeNode createTree(String strIn, String strMi) {
        BinaryTreeNode node;
        if (strIn == null || "".equals(strIn) || strMi == null || "".equals(strMi)) {
            return null;
        }
        String leftStr = null;
        String rightStr = null;
        int len = 0;
        // 根节点
        char root = strIn.charAt(0);
        int index = strMi.indexOf(root);
        if (index > 0) {
            leftStr = strMi.substring(0, index);
            len = leftStr.length();
        }
        if (index < strMi.length() - 1) {
            rightStr = strMi.substring(index + 1);
        }

        String newIn = strIn.substring(1, 1+ len);
        String newMe = strIn.substring(1+len);
        node = new BinaryTreeNode(Integer.valueOf((strIn.charAt(0))+""), createTree(newIn, leftStr), createTree(newMe, rightStr));
        return node;
    }

    private static void listTree(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        listTree(node.getLeftNode());
        listTree(node.getRightNode());
        System.out.print(node.getData() + " ");
    }
}
