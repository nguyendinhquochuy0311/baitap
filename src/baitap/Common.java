package baitap;

public class Common {
    public static boolean isNumericData(String strNum) {

        if (strNum == null) {
            System.out.println("value numeric require not null");
            return false;
        }
        try {
            double numberData = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            System.out.println("value numeric require is a positive integer");
            return false;
        }
        return true;
    }

    public static boolean isNumericNotNegativeNumber(String strNum) {

        if (strNum == null) {
            System.out.println("value numeric require not null");
            return false;
        }
        try {
            int number = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            System.out.println("value numeric require is a positive integer");
            return false;
        }
        return true;
    }

    public static boolean isNumericNotZero(String strNum) {

        if (strNum == null) {
            System.out.println("value numeric require not null");
            return false;
        }
        try {
            int number = Integer.parseInt(strNum);
            if (number == 0) {
                System.out.println("value numeric require not zero");
                return false;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("value numeric require is a positive integer");
            return false;
        }
        return true;
    }

    public static boolean isNumeric(String strNum) {

        if (strNum == null) {
            System.out.println("value numeric require not null");
            return false;
        }
        try {
            int number = Integer.parseInt(strNum);
            if (number <= 0) {
                System.out.println("value numeric require not less 0");
                return false;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("value numeric require is a positive integer");
            return false;
        }
        return true;
    }

    public static int isNumberInt(int intNum) {
        int i = 1;
        i++;
        intNum = intNum + i;
        return intNum;
    }

    public static boolean isNotBlank(String str) {
        if (str == null || str.equals("")) {
            System.out.println("value numeric require not null");
            return false;
        }
        return true;
    }
}

