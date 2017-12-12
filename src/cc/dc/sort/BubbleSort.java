package cc.dc.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {1,4,2,4,12,3,5,9,8};
        bubbleSortMax(array);
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void bubbleSortMax(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array.length - 1; j >= array.length - i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
