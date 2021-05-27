package baitap.baitap611;

import java.util.Calendar;
import java.util.Scanner;

public class BaiTap611 {
    public static void main(String[] args) {
//        Bài 611: Hãy khai báo kiểu dữ liệu để biểu diễn thông tin của một chuyến bay. Biết rằng một chuyến bay gồm những thành phần sau:
//
//        Mã chuyến bay: chuỗi tối đa 5 ký tự
//        Ngày bay: kiểu dữ liệu ngày
//        Giờ bay: kiểu thời gian
//        Nơi đi: chuỗi tối đa 20 ký tự
//        Nơi đến: chuỗi tối đa 20 ký tự
//        Sau đó viết hàm nhập, xuất cho kiểu dữ liệu này
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Mã chuyến bay");
        String flightCode = scanner.nextLine();
        int sizeFlightCode = String.valueOf(flightCode).length();
        if (sizeFlightCode > 5) {
            System.out.println("Mã chuyến bay không được quá 5 kí tự");
        }

        System.out.println("Nhập ngày bay");
        int flightDate = scanner.nextInt();

        System.out.println("Nhập tháng bay");
        int flightMonth = scanner.nextInt();

        System.out.println("Nhập năm bay");
        int flightYear = scanner.nextInt();

        System.out.println(" Ngày bay:" + flightDate + "/" + flightMonth + "/" + flightYear);

        Calendar date = Calendar.getInstance();



    }
}
