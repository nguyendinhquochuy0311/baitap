package baitap;

import java.util.Scanner;

public class BaiTap731 {
    //    Bài 731: Tính S(n) = 1^2 + 2^2 + … + n^2
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += Math.pow(i, 2);
        }
        System.out.println(s);
    }
}