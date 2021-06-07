package baitap;

import java.util.Scanner;

public class BaiTap721 {
    //    Bài 732: Tính S(n) = 1 + ½ + 1/3 + … + 1/n
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
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += (double) 1 / i;
        }
        System.out.println(s);

    }
}
