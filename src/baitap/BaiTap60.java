package baitap;

import java.util.Scanner;

public class BaiTap60 {

    //Bài 60: Hãy kiểm tra các chữ số của số nguyên dương number có tăng dần từ trái sang phải hay không

    public static void main(String[] args) {

        System.out.println("nhap number:");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        int lengthNumber = String.valueOf(number).length() - 1;

        int beforeNumber;
        int afterNumber = number % 10;

        for (int i = 0; i < lengthNumber; i++) {

            number = number / 10;
            beforeNumber = number % 10;

            if (afterNumber <= beforeNumber) {
                System.out.println(" khong tang dan");
                return;
            }

            afterNumber = beforeNumber;

        }
        System.out.println(" tang dan");
    }
}
