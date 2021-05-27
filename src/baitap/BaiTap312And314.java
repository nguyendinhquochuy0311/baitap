package baitap;

import java.util.Scanner;

public class BaiTap312And314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang");
        int rowNumber = scanner.nextInt();

        System.out.println("nhap so cot");
        int columNumber = scanner.nextInt();

        double[][] matrix = new double[rowNumber][columNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columNumber; j++) {
                System.out.println("nhap gia tri tai toa do: [" + i + "][" + j + "]:");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columNumber; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
