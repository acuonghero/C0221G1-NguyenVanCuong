package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {

    static void xoaPhantu(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        System.out.println("Nhập phần tử cần xóa");
        int X = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index = i;
            }
        }
        for (int j = index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length-1]=0;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        xoaPhantu(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
