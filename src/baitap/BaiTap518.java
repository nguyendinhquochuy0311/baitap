package baitap;

import java.util.Scanner;

//        Bài 518: Định nghĩa toán tử operator * cho 2 phân số
//        Bài 519: Định nghĩa toán tử operator / cho 2 phân số
//        Bài 520: Định nghĩa toán tử operator ++ cho 2 phân số
//        Bài 521: Định nghĩa toán tử operator — cho 2 phân số
public class BaiTap518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tu");
        int tu1 = scanner.nextInt();
        System.out.println("nhap mau");
        int mau1 = scanner.nextInt();

        double so1 = (double) tu1 / mau1;
        System.out.println("Số thứ nhất là:" + so1);

        System.out.println("nhap tu");
        int tu2 = scanner.nextInt();
        System.out.println("nhap mau");
        int mau2 = scanner.nextInt();

        double so2 = (double) tu2 / mau2;
        System.out.println("Số thứ 2 là:" + so2);

        double tich = so1 * so2;
        double thuong = so1 / so2;
        double tong = so1 + so2;
        double hieu = so1 - so2;

        System.out.println("Tổng 2 số là:" + tong);
        System.out.println("Hiệu 2 số là:" + hieu);
        System.out.println("Tích 2 số là:" + tich);
        System.out.println("Thương 2 số là:" + thuong);
    }
}
