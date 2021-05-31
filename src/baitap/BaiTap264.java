package baitap;

import java.util.ArrayList;

public class BaiTap264 {
    public static void main(String[] args) {
//        Bài 264: Trộn 2 mảng đã tăng thành 1 mảng được sắp xếp tăng

        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};
        int size = arr1.length + arr2.length;

        int[] arrAll = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            arrAll[i] = arr1[i];
        }

        int t = 0;
        for (int j = arr1.length; j < size; j++) {
            arrAll[j] = arr2[t];
            t++;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arrAll[i] + "\t");
        }
        System.out.println();

        int temp;
        int l = size - 1;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < (l - 1); j++) {
                if (arrAll[j] > arrAll[j + 1]) {
                    temp = arrAll[j];
                    arrAll[j] = arrAll[j + 1];
                    arrAll[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arrAll[i] + "\t");
        }
        System.out.println();

    }
}
