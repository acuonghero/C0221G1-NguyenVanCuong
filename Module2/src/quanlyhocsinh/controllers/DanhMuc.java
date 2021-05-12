package quanlyhocsinh.controllers;

import java.util.Scanner;

public class DanhMuc {
    public static void danhMuc() {

        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Danh muc : \n" +
                        "1-Hiển thị danh sách học sinh\n" +
                        "2-thêm mới 1 học sinh(Có validate dữ liệu)\n" +
                        "3-xóa 1 học sinh theo tên\n" +
                        "4-tìm kiếm học sinh theo tên(tìm tương đối)\n" +
                        "5-Thoát\n" +
                        "6-Sửa");
                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1:
                        QuanLySinhVien.hienThi();
                        break;
                    case 2:
                        QuanLySinhVien.them();
                        break;
                    case 3:
                        QuanLySinhVien.xoa();
                        break;
                    case 4:
                        QuanLySinhVien.timKiem();
                        break;
                    case 5:
                        System.exit(0);
                    case 6 :
                        QuanLySinhVien.sua();
                        break;
                    default:
                        System.out.println("nhập sai rồi");
                        break;
                }
            }catch (Exception e){
                System.out.println(e);
            }
        } while (true);

    }

}
