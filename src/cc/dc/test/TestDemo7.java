package cc.dc.test;

public class TestDemo7 {

    public static void main(String[] args) {
//        System.out.println(number2String(1));
//        System.out.println(number2String(11));
//        System.out.println(number2String(10));
//        System.out.println(number2String(16));
//        System.out.println(number2String(26));
//        System.out.println(number2String(36));

        for (int i = 0; i < 30; i++) {
            System.out.println(number2String(i + 1));
        }
    }

    private static String number2String(int number) {
        if (number > 10) {
            int numberTwo = number / 10;
            int numberOne = number % 10;
            if (numberTwo > 1) {
                if (numberOne == 0) {
                    return number2String(numberTwo) + "十";
                }
                return number2String(numberTwo) + "十" + number2String(numberOne);
            } else {
                return "十" + number2String(numberOne);
            }
        }
        String result;
        switch (number) {
            case 1:
                result = "一";
                break;
            case 2:
                result = "二";
                break;
            case 3:
                result = "三";
                break;
            case 4:
                result = "四";
                break;
            case 5:
                result = "五";
                break;
            case 6:
                result = "六";
                break;
            case 7:
                result = "七";
                break;
            case 8:
                result = "八";
                break;
            case 9:
                result = "九";
                break;
            case 10:
                result = "十";
                break;
            default:
                String numberStr = String.valueOf(number);
                result = "十" + number2String(Integer.valueOf(numberStr.substring(1)));
                break;
        }
        return result;
    }
}
