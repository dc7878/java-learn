package cc.dc.algorithm.newcow;

import cc.dc.structure.tree.BinaryTreeNode;

import java.util.ArrayList;

/**
 * 一颗二叉树，从根节点开始找target值和的path,获取所有的路径集合
 */
public class day02_1227 {
    private static ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();

    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

    }

    private static ArrayList<ArrayList<Integer>> findPaths(BinaryTreeNode node, int target) {
        if (node == null) {
            return listAll;
        }
        list.add(node.getData());
        target -= node.getData();
        if (target == 0 && node.getLeftNode() == null && node.getRightNode() == null) {
            listAll.add(new ArrayList<>(list));
        }
        findPaths(node.getLeftNode(), target);
        findPaths(node.getRightNode(), target);
        list.remove(list.size() - 1);
        return listAll;
    }
}
