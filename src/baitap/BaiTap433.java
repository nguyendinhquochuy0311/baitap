package baitap;

import java.util.Scanner;

public class BaiTap433 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang");
        int rowNumber = scanner.nextInt();

        System.out.println("nhap so cot");
        int columNumber = scanner.nextInt();

        int[][] matrix = new int[rowNumber][columNumber];

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columNumber; j++) {
                System.out.println("nhap gia tri tai toa do:[" + i + "];[" + j + "]:");
                matrix[i][j] = scanner.nextInt();
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
