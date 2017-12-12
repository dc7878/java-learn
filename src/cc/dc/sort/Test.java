package cc.dc.sort;

public class Test {
    public static void main(String[] args) {
        int[] array = {5,2,4,9,3};
        sort(array);
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void sort(int[] array) {
        int size = array.length;
        int index;
        for (int i = 0; i < size; i++) {
            int temp = array[i];
            index = i;
            for (int j = i + 1; j < size; j++) {
                if (temp > array[j]) {
                    temp = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
