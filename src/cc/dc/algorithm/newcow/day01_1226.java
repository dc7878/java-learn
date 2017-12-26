package cc.dc.algorithm.newcow;

/**
 * 已知一个数组，判断数组是不是二叉树的后续遍历的结果
 */
public class day01_1226 {

    public static void main(String[] args) {
        int[] array = {1,4,3,5,6,7};
        System.out.println(isLast(array));
    }

    private static boolean isLast(int[] array) {
        if (array.length == 0) {
            return false;
        }
        return isLastOrder(array, 0, array.length - 1);
    }

    private static boolean isLastOrder(int[] array, int start, int end) {
        if (end <= start) {
            return true;
        }

        int i = start;
        for (; i < end; i++) {
            if (array[i] > array[end]) {
                break;
            }
        }
        for (int j = i; j < end; j++) {
            if (array[j] < array[end]) {
                return false;
            }
        }

        return isLastOrder(array, start, i - 1) && isLastOrder(array, i, end - 1);
    }
}
