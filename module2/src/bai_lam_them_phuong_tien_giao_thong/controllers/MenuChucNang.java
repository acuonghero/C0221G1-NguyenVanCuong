package bai_lam_them_phuong_tien_giao_thong.controllers;

import java.util.Scanner;

import static bai_lam_them_phuong_tien_giao_thong.controllers.ChucNang.*;

public class MenuChucNang {
    public static void chucNang(){
        String chon;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện theo biển kiểm soát\n" +
                    "4. Thoát\n");
            chon = sc.nextLine();
            switch (chon){
                case "1" :
                    them();
                    break;
                case "2" :
                    hienThi();
                    break;
                case "3" :
                    xoa();
                    break;
                case "4" :
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn 1-4");
            }
        }
    }
}
