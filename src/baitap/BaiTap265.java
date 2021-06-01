package baitap;

public class BaiTap265 {
    public static void main(String[] args) {
//        Bài 265: Cho 2 mảng tăng. Hãy trộn thành 1 mảng giảm dần

        int[] arr1 = {1, 2, 3, 6, 6, 115, 123, 126};
        int[] arr2 = {4, 5, 7, 8, 10, 100, 150, 123};
        int size = arr1.length + arr2.length;
        int[] arrAll = new int[size];
        int temp;

        for (int i = 0; i < arr1.length; i++) {
            arrAll[i] = arr1[i];
        }
        System.out.println();

        int t = 0;
        for (int j = arr1.length; j < size; j++) {
            arrAll[j] = arr2[t];
            t++;
        }

        System.out.println("mang sau khi tron:");
        for (int i = 0; i < size; i++) {
            System.out.print(arrAll[i] + "\t");
        }


        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < (size - 1); j++) {
                if (arrAll[j] < arrAll[j + 1]) {
                    temp = arrAll[j];
                    arrAll[j] = arrAll[j + 1];
                    arrAll[j + 1] = temp;
                }
            }
        }

        System.out.println("\nmang sau khi sap xep:");

        for (int i = 0; i < size; i++) {
            System.out.print(arrAll[i] + "\t");
        }
    }
}