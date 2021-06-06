package baitap;

public class Common {
    public static boolean isNumericData(String strNum) {

        if (strNum == null) {
            System.out.println("retype");
            return false;
        }
        try {
            double numberData = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            System.out.println("retype");
            return false;
        }
        return true;
    }

    public static boolean isNumeric(String strNum) {

        if (strNum == null) {
            System.out.println("reType");
            return false;
        }
        try {
            int number = Integer.parseInt(strNum);
            if (number <= 0) {
                System.out.println("reType");
                return false;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("reType");
            return false;
        }
        return true;
    }
}