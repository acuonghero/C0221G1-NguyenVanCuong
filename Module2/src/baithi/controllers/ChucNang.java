package baithi.controllers;

import java.util.Scanner;

public class ChucNang {
    public static void danhBa(){
        Scanner sc = new Scanner(System.in);
        String chon;
        while (true){
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----\n"+
                    "Chọn chức năng theo số (để tiếp tục):\n"+
                    "1. Xem danh sách\n"+
                    "2. Thêm mới\n"+
                    "3. Cập nhật\n"+
                    "4. Xóa\n"+
                    "5. Tìm kiếm\n"+
                    "6. Đọc từ file\n"+
                    "7. Ghi vào file\n"+
                    "8. Thoát\n");
            chon = sc.nextLine();
            switch (chon){
                case "1":
                    QuanLyChucNang.xemDanhSach();
                    break;
                case "2":
                    QuanLyChucNang.them();
                    break;
                case "3":
                    QuanLyChucNang.capNhat();
                    break;
                case "4":
                    QuanLyChucNang.xoa();
                    break;
                case "5":
                    QuanLyChucNang.timKiem();
                case "6":
                case "7":
                case "8":
                    System.exit(0);
                default:
                    System.out.println("vui lòng nhập từ 1-8");
            }
        }
    }
}
