package Ss3_Mang_va_phuong_thuc_trong_java.Bai_tap;

import java.util.Scanner;

public class Tim_phan_tu_lon_nhat_trong_mang_2_chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ độ dài mảng 2 chiều ");
        int leng = scanner.nextInt();
        int[][] arr = new int[leng][leng];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Nhập vào phần tử mảng");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Kết quả: ");
        System.out.printf("%d là giá trị lớn nhất",max);
    }
}
