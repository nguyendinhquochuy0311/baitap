package baitap;

import java.util.Scanner;

public class BaiTap34 {

    //Tính S(n) = CanBac2(n+CanBac2(n – 1 + CanBac2( n – 2 + … + CanBac2(2 + CanBac2(1)  có n dấu căn
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        double s = 0d;
        for (int i = 1; i <= n; i++) {
            s = Math.sqrt(i + s);
        }
        System.out.println(s);
    }
}
