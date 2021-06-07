package baitap;

import java.util.Scanner;

public class BaiTap312And314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean checkType;
        String rowNumberStr;
        System.out.println("nhap so hang");

        do {
            rowNumberStr = scanner.nextLine();
            checkType = Common.isNumeric(rowNumberStr);
        } while (!checkType);

        int rowNumber = Integer.parseInt(rowNumberStr);

        String columnNumberStr;
        System.out.println("nhap so cot");

        do {
            columnNumberStr = scanner.nextLine();
            checkType = Common.isNumeric(columnNumberStr);
        } while (!checkType);

        int columnNumber = Integer.parseInt(columnNumberStr);

        double[][] matrix = new double[rowNumber][columnNumber];

        boolean checkNumber;
        String number;
        double numberMatrix;
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.println("nhap gia tri tai toa do: [" + i + "][" + j + "]:");
                do {
                    number = scanner.nextLine();
                    checkNumber = Common.isNumericData(number);
                } while (!checkNumber);
                numberMatrix = Double.parseDouble(number);
                matrix[i][j] = numberMatrix;
            }
        }
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
