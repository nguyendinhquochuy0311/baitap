package baitap;

import java.util.Scanner;

public class BaiTap721 {
    //    Bài 732: Tính S(n) = 1 + ½ + 1/3 + … + 1/n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += (double) 1 / i;
            System.out.println(s);
            System.out.println(i);
        }
        System.out.println(s);

    }
}
