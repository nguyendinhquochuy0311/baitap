package baitap;

import java.util.Scanner;

public class BaiTap101 {

    //    Bài 101: Viết chương trình nhập tháng, năm. Hãy cho biết tháng đó có bao nhiêu ngày
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thang");
        int month = scanner.nextInt();

        System.out.println("nhap nam");
        int year = scanner.nextInt();

        if (month == 2) {
            if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
                System.out.println("so ngay la 29");
            } else {
                System.out.println("so ngay la 28");
            }
        } else if ((month <= 7 && month % 2 == 0) || (month >= 8 && month % 2 != 0)) {
            System.out.println("so ngay la 30");
        } else {
            System.out.println("so ngay la 31");
        }
    }
}
