package Ss3_Mang_va_phuong_thuc_trong_java.Bai_tap;

import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài mảng");
        int n = scanner.nextInt();

        int[] mang1 = new int[n];
        int[] mang2 = new int[n];

        for(int i = 0; i < n;i++){
            System.out.println("Nhập vào phần tử mảng 1");
            mang1[i] = scanner.nextInt();
            System.out.println("Nhập vào phần tử mảng 2");
            mang2[i]= scanner.nextInt();
        }

//        for(int i=0;i<mang1.length;i++){
//            System.out.print(mang1[i] + " " );
//        }
//
//        for(int i=0;i<mang2.length;i++){
//            System.out.print(mang2[i] + " " );
//        }
        int[] mang3 = new int[mang1.length+mang2.length];

//        int leng1 = mang1.length;
//        int leng2 =mang2.length;
//        int leng2 = mang3.length;

        for (int i=0;i<mang1.length;i++){
            mang3[i]=mang1[i];
        }
        for (int i=mang3.length-mang1.length;i<mang3.length;i++){
            mang3[i]=mang2[i-mang1.length];
        }


        for (int i=0;i<mang3.length;i++){
            System.out.print(mang3[i]+ " ");
        }
    }
}