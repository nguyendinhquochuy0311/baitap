package baitap;

import java.util.Scanner;

public class Fibonacci {
    //    Viết chương trình c tìm n số Fibonacci đầu tiên.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so chu so dau tien");

        boolean checkType;
        String numberCheck;
        do {
            numberCheck = scanner.nextLine();
            checkType = Common.isNumeric(numberCheck);
        } while (!checkType);

        int inputNumber = Integer.parseInt(numberCheck);

        int beforeNumber = 0;
        int afterNumber = 1;
        int sumOfNumber = 0;

        for (int i = 0; i < inputNumber; i++) {

            sumOfNumber = beforeNumber + afterNumber;

            if (sumOfNumber < 0) {
                System.out.println("over limit");
                return;
            }

            System.out.println(sumOfNumber);

            beforeNumber = afterNumber;
            afterNumber = sumOfNumber;

        }
    }
}