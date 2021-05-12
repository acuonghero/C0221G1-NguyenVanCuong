package ontapoop.controllers;

import java.util.Scanner;

public class MenuChucNang {
    public static void menu(){
        String chon;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("MENU\n" +
                    "1 - Nhập thông tin mới cho cán bộ\n" +
                    "2 - Tìm kiếm theo tên(tương đối)\n" +
                    "3 - Sắp xếp theo tên.\n" +
                    "4 - Xóa theo danh sách \n" +
                    "5 - Hiển thị thông tin về danh sách các cán bộ\n"+
                    "6 - Thoát");

            chon = sc.nextLine();
            switch (chon){
                case "1" :
                    ChucNang.themCanBo();
                    break;
                case "2" :
                    ChucNang.timKiem();
                    break;
                case "3" :
                    ChucNang.sapXep();
                    break;
                case "4" :
                    ChucNang.xoa();
                    break;
                case "5" :
                    ChucNang.hienThiCanBo();
                    break;
                case "6" :
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1-5");
            }
        }
    }
}
