package cc.dc.structure;

import java.util.Stack;

public class StackTest {


    public static void main(String[] args) {
        int[] data1 = {1,2,3,4,5};
        int[] data2 = {3,4,5,2,1};
        int[] data3 = {3,5,4,1,2};
        System.out.println(isPopRight(data1, data2));
        System.out.println(isPopRight(data1, data3));
    }

    private static boolean isPopRight(int[] data1, int[] data2) {
        Stack<Integer> stack = new Stack();
        for (int i = 0, j = 0; i < data1.length; i++) {
            stack.push(data1[i]);
            while (stack.size() > 0 && stack.peek()== data2[j]) {
                stack.pop();
                j++;
            }
        }
        return  stack.size() == 0;
    }
}
