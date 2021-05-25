package baitap;

import java.util.Scanner;

public class Fibonacci {
    //    Viết chương trình c tìm n số Fibonacci đầu tiên.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            a += b;
        }
    }
}
