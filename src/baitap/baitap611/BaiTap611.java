package baitap.baitap611;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BaiTap611 {
    public static void main(String[] args) throws Exception {
//        Bài 611: Hãy khai báo kiểu dữ liệu để biểu diễn thông tin của một chuyến bay. Biết rằng một chuyến bay gồm những thành phần sau:
//
//        Mã chuyến bay: chuỗi tối đa 5 ký tự
//        Ngày bay: kiểu dữ liệu ngày
//        Giờ bay: kiểu thời gian
//        Nơi đi: chuỗi tối đa 20 ký tự
//        Nơi đến: chuỗi tối đa 20 ký tự
//        Sau đó viết hàm nhập, xuất cho kiểu dữ liệu này
        int numberCustomer;
        System.out.println("flight");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập Mã chuyến bay");
//        String flightCode = scanner.nextLine();
//
//        System.out.println("Nhap ngay bay");
//        String flightDate = scanner.nextLine();

        String dateString = "6/5/2017";

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        Date date = null;

        date = df.parse(dateString);

        System.out.println(date);


//        int sizeFlightCode = String.valueOf(flightCode).length();
//        if (sizeFlightCode > 5) {
//            System.out.println("Mã chuyến bay không được quá 5 kí tự");
//        }

        FlightInformation flightInformation = new FlightInformation();
        FlightInformation flightInformations = new FlightInformation();
//        /asdsadasdsadsa
        flightInformations.toString();

        int a[] = {112};
    }
}
