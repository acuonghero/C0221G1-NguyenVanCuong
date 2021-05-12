package bai_lam_them_phuong_tien_giao_thong.controllers;

import bai_lam_them_phuong_tien_giao_thong.commoms.GhiDocFile;
import bai_lam_them_phuong_tien_giao_thong.commoms.NhapPhuongTien;


import bai_lam_them_phuong_tien_giao_thong.model.PhuongTien;


import java.util.List;
import java.util.Scanner;

public class ChucNang {

    public static void xoa() {
        String nhap;
        Scanner sc = new Scanner(System.in);
        List<PhuongTien> phuongTienList = GhiDocFile.docFile("phuongtien.csv");
        System.out.println("Nhập biển số xe cần xóa");
        nhap = sc.nextLine();
        for (int i = 0; i<phuongTienList.size();i++) {
            if(phuongTienList.get(i).getBienKiemSoat().equals(nhap)){
                phuongTienList.remove(i);
                GhiDocFile.ghiFile("phuongtien.csv",phuongTienList,false);
                break;
            }else {
                System.err.println("Không có biển kiểm soát này");
                break;
            }
        }

    }

    public static void them() {
        String chon;

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("DANH SÁCH PHƯƠNG TIỆN \n" +
                    "1-Xe ô tô \n" +
                    "2-Xe tải \n" +
                    "3-Xe máy\n" +
                    "4-Quay lại danh mục trước \n" +
                    "5-Thoát");
            chon = sc.nextLine();
            switch (chon) {
                case "1":
                    NhapPhuongTien.nhapOTo();
                    break;
                case "2":
                    NhapPhuongTien.nhapXeTai();
                    break;
                case "3":
                    NhapPhuongTien.nhapXeMay();
                case "4":
                    MenuChucNang.chucNang();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lồng nhập từ 1-5");
            }
        }
    }

    public static void hienThi() {
       List<PhuongTien> phuongTienList =GhiDocFile.docFile("phuongtien.csv");
       for(PhuongTien phuongTien : phuongTienList){
           phuongTien.hienThi();
       }
    }
}
