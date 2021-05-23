package baitap;

import java.util.Scanner;

public class BaiTap18 {

    //Bài 18: Tính S(n) = 1 + x^2/2! + x^4/4! + … + x^2n/(2n)!
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap n");
        int n = scanner.nextInt();

        System.out.println("nhap x");
        int x = scanner.nextInt();

        int s = 1;

        for (int i = 0; i < n; i++) {

            int b = factorial(i * 2);

            s += (int) Math.pow(x, 2 * n) / b;
        }
        System.out.println(s);
    }

    public static int factorial(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        return s;
    }
}