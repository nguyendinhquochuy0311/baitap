package baitap;

import java.util.Scanner;

public class Fibonacci {
    //    Viết chương trình c tìm n số Fibonacci đầu tiên.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so chu so dau tien");
        int n = scanner.nextInt();
        int number1 = 0;
        int number2 = 1;
        int sumOfNumber;
        System.out.println(number1);
        System.out.println(number2);
        for (int i = 0; i < (n - 2); i++) {
            sumOfNumber = number1 + number2;
            number1 = number2;
            number2 = sumOfNumber;
            System.out.println(sumOfNumber);
        }
    }
}