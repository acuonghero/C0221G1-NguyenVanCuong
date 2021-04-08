package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Dem_so_lan_xuat_hien_cua_ky_trong_chuoi {
    public static void main(String[] args) {
        String str = "aadhkss";
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự muốn kiểm tra");
        char characters = scanner.next().charAt(0);
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==characters ){
                count++;
            }
        }
        System.out.printf("Ký tự %s có %d ký tự",characters,count);
    }
}
