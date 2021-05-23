package baitap;

import java.util.Scanner;

public class BaiTap19 {

    //Bài 19: Tính S(n) = 1 + x + x^3/3! + x^5/5! + … + x^(2n+1)/(2n+1)!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap n");
        int n = scanner.nextInt();

        System.out.println("nhap x");
        int x = scanner.nextInt();
        int s = 1;
        int b;
        for (int i = 0; i < n; i++) {
            b = factorial(i * n + 1);
            s += x + (int) Math.pow(x, 2 * n + 1) / b;
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
