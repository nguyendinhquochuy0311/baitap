package baitap;

import java.util.Scanner;

public class BaiTap508 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan so thu nhat");

        System.out.println("nhap tu");
        int a = scanner.nextInt();
        System.out.println("nhap mau");
        int b = scanner.nextInt();

        System.out.println("nhap phan so thu hai");

        System.out.println("nhap tu");
        int c = scanner.nextInt();
        System.out.println("nhap mau");
        int d = scanner.nextInt();

        if (b == 0 || d == 0) {

            System.out.println(" mau khong duoc bang 0");

        } else {

            double z = (double) a / b;
            double q = (double) c / d;

            System.out.println(" tong cua 2 phan so la:" + (z + q));
            System.out.println("Hieu cua 2 phan so la:" + (z - q));
            System.out.println("Tich cua 2 phan so la:" + (z * q));
            System.out.println("Thuong cua 2 phan so la:" + (z / q));
        }
    }
}
