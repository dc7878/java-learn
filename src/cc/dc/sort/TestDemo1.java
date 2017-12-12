package cc.dc.sort;

public class TestDemo1 {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isSuShu(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isSuShu(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
