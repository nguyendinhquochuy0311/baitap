package baitap;

import java.util.Scanner;

public class BaiTap311And313 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean checkType;
        String columnNumberStr;
        System.out.println("input count column");

        do {
            columnNumberStr = scanner.nextLine();
            checkType = isNumeric(columnNumberStr);
        } while (!checkType);

        int columnNumber = Integer.parseInt(columnNumberStr);

        String rowNumberStr;
        System.out.println("input count row");
        do {
            rowNumberStr = scanner.nextLine();
            checkType = isNumeric(rowNumberStr);
        } while (!checkType);

        int rowNumber = Integer.parseInt(rowNumberStr);

        double[][] matrix = new double[rowNumber][columnNumber];

        boolean checkNumber;
        String number;
        double numberMatrix;

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.println("nhap gia tri cua toa do: [" + i + "],[" + j + "]: ");
                do {
                    number = scanner.nextLine();
                    checkNumber = isNumericData(number);

                } while (!checkNumber);
                numberMatrix = Double.parseDouble(number);
                matrix[i][j] = numberMatrix;
            }
        }

        System.out.println("Mang vua nhap");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

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
