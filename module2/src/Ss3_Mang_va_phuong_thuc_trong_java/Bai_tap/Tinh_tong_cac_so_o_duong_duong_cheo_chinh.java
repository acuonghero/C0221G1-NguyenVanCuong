package Ss3_Mang_va_phuong_thuc_trong_java.Bai_tap;

import java.util.Scanner;

public class Tinh_tong_cac_so_o_duong_duong_cheo_chinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng 2 chiều ");
        int leng = scanner.nextInt();
        int[][] arr = new int[leng][leng];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Nhập vào phần tử mảng");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập vào vị trí cột muốn tính tổng");

        int sum=0;
        for (int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }

        System.out.printf("Tổng đường chéo chính là %d",sum);
    }
}
