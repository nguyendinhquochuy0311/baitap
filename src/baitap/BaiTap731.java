package baitap;

import java.util.Scanner;

public class BaiTap731 {
    //    Bài 731: Tính S(n) = 1^2 + 2^2 + … + n^2
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");

        boolean checkType;
        String numberCheck;

        do {
            numberCheck = scanner.nextLine();
            checkType = Common.isNumeric(numberCheck);
        } while (!checkType);

        int n = Integer.parseInt(numberCheck);
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += Math.pow(i, 2);
        }
        System.out.println(s);
    }
}