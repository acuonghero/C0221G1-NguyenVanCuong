package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào dộ dài mảng");
        int n = scanner.nextInt();


        int[] array = new int[n];
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập vào phần tử");
            array[i] = scanner.nextInt();
        }
        System.out.println("nhập vào vị trí muốn thêm");
        int index = scanner.nextInt();
        System.out.println("nhập phần tử muốn thêm");
        int num = scanner.nextInt();
        for (int i = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[index] = num;
            } else if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i - 1];
            }
        }
        System.out.println("kết quả :\n");
        for (int i = 0; i < newArray.length; i++) {

            System.out.print(newArray[i] + "\t");
        }

    }

}

