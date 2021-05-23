package baitap;

import java.util.Scanner;

public class BaiTap61 {

    //Bài 61: Hãy kiểm tra các chữ số của số nguyên dương number có giảm dần từ trái sang phải hay không
    public static void main(String[] args) {

        System.out.println("nhap number:");
        Scanner scanner = new Scanner(System.in);

        int number;
        boolean checkNumber;
        do {
            number = scanner.nextInt();
            checkNumber = isValidateNumber(number);

        } while (!checkNumber);

        int beforeNumber;
        int lengthNumber = String.valueOf(number).length() - 1;
        int afterNumber = number % 10;
        for (int i = 0; i < lengthNumber; i++) {

            number = number / 10;
            beforeNumber = number % 10;

            if (afterNumber >= beforeNumber) {
                System.out.println("khong giam dan");
                return;
            }
            afterNumber = beforeNumber;
        }
        System.out.println("giam dan");
    }

    public static boolean isValidateNumber(int number) {
        if (number < 0) {
            System.out.println(" day khong phai so nguyen duong, vui long nhap lai");
            return false;
        }
        if (String.valueOf(number).length() <= 1) {
            System.out.println(" khong so danh duoc, vui long nhap lai");
            return false;
        }
        return true;
    }
}
