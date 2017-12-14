package cc.dc.sort;

/**
 * 插入排序
 * 1.从第一个元素开始，认为第一个元素已经排序了
 * 2.取出下一个元素，从后往前扫描
 * 3.如果大于或者小于已经排序好的元素，则交换他们
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = {4,2,7,5,9,1,3};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void insertSort(int[] array) {
        int len = array.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1]= temp;
                }
            }
        }
    }
}
