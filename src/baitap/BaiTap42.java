package baitap;

import java.util.Scanner;

public class BaiTap42 {

    //Cho n là số nguyên dương. Hãy tìm giá trị nguyên dương k lớn nhất sao cho S(k)  < n. Trong đó chuỗi k được định nghĩa như sau: S(k) = 1 + 2 + 3 + … + k
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        int s = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            s += i;
            if (s >= n) {
                k = i - 1;
                break;
            }
        }
        System.out.println(k);
    }
}
