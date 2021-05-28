package baitap.baitap611;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//        Bài 611: Hãy khai báo kiểu dữ liệu để biểu diễn thông tin của một chuyến bay. Biết rằng một chuyến bay gồm những thành phần sau:
//
//        Mã chuyến bay: chuỗi tối đa 5 ký tự
//        Ngày bay: kiểu dữ liệu ngày
//        Giờ bay: kiểu thời gian
//        Nơi đi: chuỗi tối đa 20 ký tự
//        Nơi đến: chuỗi tối đa 20 ký tự
//        Sau đó viết hàm nhập, xuất cho kiểu dữ liệu này

public class BaiTap611 {

    public final static  String DATE_FORMAT = "dd/MM/yyyy";

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input flight code");

        FlightInformation flightInformation = new FlightInformation();

        String flight, dateString, departure, destination;
        boolean isInfoFlight;

        do {
            flight = scanner.nextLine();
            flightInformation.setFlightCode(flight);

            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            dateString = scanner.nextLine();
            Date date = df.parse(dateString);
            flightInformation.setFlightDate(date);

            departure = scanner.nextLine();
            flightInformation.setDeparture(departure);

            destination = scanner.nextLine();
            flightInformation.setDestination(destination);

            isInfoFlight = isValidateInput(true, false, false, false, flightInformation);

        } while (!isInfoFlight);

        String str = flightInformation.toString();
        System.out.println(str);    }

    public static boolean isValidateInput(boolean flightCode, boolean date, boolean departure, boolean destination, FlightInformation flightInformation) {
        if (flightCode && flightInformation.getFlightCode().length() > 5) {
            System.out.println("retype flight code");
            return false;
        }

        if (date && !isDateValid(flightInformation.getFlightDate())) {
            System.out.println("retype flight date");
            return false;
        }

        if (departure && flightInformation.getDeparture().length() > 20) {
            System.out.println("retype flight Departure");
            return false;
        }

        if (destination && flightInformation.getDestination().length() > 20) {
            System.out.println("retype flight Destination");
            return false;
        }

        return true;
    }

    public static String convertDateToString(Date date) {

        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        String strDate = dateFormat.format(date);

        return strDate;
    }

    public static boolean isDateValid(Date date) {
        try {
            String strDate = convertDateToString(date);
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);

            df.setLenient(false);
            df.parse(strDate);

            return true;
        } catch (ParseException e) {
            System.out.println("retype");
            return false;
        }
    }
}
