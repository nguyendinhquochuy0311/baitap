package baitap;

import java.util.Scanner;

public class BaiTap507 {
    public static void main(String[] args) {
//        Bài 507: Tính tổng 2 phân số

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap a");
        double a = scanner.nextDouble();

        System.out.println("nhap b");
        double b = scanner.nextDouble();

        double s = a + b;

        System.out.println(s);
    }
}
