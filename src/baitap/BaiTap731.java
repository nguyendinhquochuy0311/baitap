package baitap;

import java.util.Scanner;

public class BaiTap731 {
    //    Bài 731: Tính S(n) = 1^2 + 2^2 + … + n^2
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");

        boolean checkType;
        String numberCheck;

        do {
            numberCheck = scanner.nextLine();
            checkType = Common.isNumeric(numberCheck);
        } while (!checkType);

        int inputNumber = Integer.parseInt(numberCheck);
        int sum = 0;
        for (int i = 1; i <= inputNumber; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}