package baitap;

import java.util.Scanner;

public class BaiTap40 {
    // Tính S(n) = 1 / (1 + 1 / ( 1 + 1 / (…. 1 + 1 / 1 + 1))) có n dấu phân số
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();

        double s = 1d;

        for (int i = 0; i < n; i++) {
            s = 1 + 1 / s;
        }
        System.out.println(s);
    }
}

