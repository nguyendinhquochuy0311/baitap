package baitap;

import java.util.Scanner;

public class BaiTap33 {

    //Bài 33: Tính S(n) = CanBac2(2+CanBac2(2+….+CanBac2(2 + CanBac2(2)))) có n dấu căn
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        double s = Math.sqrt(2);

        for (int i = 1; i < n; i++) {
            s = Math.sqrt(2 + s);
        }
        System.out.println(s);
    }
}
