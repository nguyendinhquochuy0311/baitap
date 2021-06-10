package baitap;

import java.util.Scanner;

public class BaiTap721 {
    //    Bài 732: Tính S(n) = 1 + ½ + 1/3 + … + 1/n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");

        boolean checkType;
        String numberCheck;
        do {
            numberCheck = scanner.nextLine();
            checkType = Common.isNumeric(numberCheck);
        } while (!checkType);

        int inputNumber = Integer.parseInt(numberCheck);
        double sum = 0;
        for (int i = 1; i <= inputNumber; i++) {
            sum += (double) 1 / i;
        }
        System.out.println(sum);
    }
}
