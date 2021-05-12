package bai_lam_them_phuong_tien_giao_thong.commoms;

import bai_lam_them_phuong_tien_giao_thong.model.OTo;
import bai_lam_them_phuong_tien_giao_thong.model.PhuongTien;
import bai_lam_them_phuong_tien_giao_thong.model.XeMay;
import bai_lam_them_phuong_tien_giao_thong.model.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhapPhuongTien {
    public static void nhapOTo() {
        String nhapHangSanXuat;
        String nhapNamSanXuat;
        String nhapChuSoHuu;
        String nhapKieuXe;
        String nhapSoChoNgoi;
        Scanner sc = new Scanner(System.in);
        String nhapBienKiemSoat;
        do {
                OTo phuongTien =new OTo();
                nhapBienKiemSoat = PhuongTienException.kiemTraBienOTo();
                System.out.println("nhập hãng sản xuất");
                nhapHangSanXuat = sc.nextLine();
                System.out.println("nhập năm sản xuất");
                nhapNamSanXuat = sc.nextLine();
                System.out.println("nhập chủ sở hữu");
                nhapChuSoHuu = sc.nextLine();
                if (nhapBienKiemSoat.contains("A")) {
                    nhapKieuXe = "Du lịch";
                } else {
                    nhapKieuXe = "Xe khách";
                }
                System.out.println("nhập số chổ ngồi");
                nhapSoChoNgoi = sc.nextLine();
                phuongTien.setBienKiemSoat(nhapBienKiemSoat);
                phuongTien.setTenHangSanXuat(nhapHangSanXuat);
                phuongTien.setChuSoHuu(nhapChuSoHuu);
                phuongTien.setNamSanXuat(nhapNamSanXuat);
                phuongTien.setKieuXe(nhapKieuXe);
                phuongTien.setSoChoNgoi(nhapSoChoNgoi);

                List<PhuongTien> phuongTienList = new ArrayList<>();
                phuongTienList.add(phuongTien);
                GhiDocFile.ghiFile("phuongtien.csv",phuongTienList,true);
                break;

        } while (true);


    }

    public static XeTai nhapXeTai() {
        String nhapHangSanXuat;
        String nhapNamSanXuat;
        String nhapChuSoHuu;
        String nhapTaiTrong;
        String nhapBienKiemSoat;
        Scanner sc = new Scanner(System.in);


        while (true) {

                nhapBienKiemSoat = PhuongTienException.kiemTraBienXeTai();
                System.out.println("nhập hãng sản xuất");
                nhapHangSanXuat = sc.nextLine();
                System.out.println("nhập năm sản xuất");
                nhapNamSanXuat = sc.nextLine();
                System.out.println("nhập chủ sở hữu");
                nhapChuSoHuu = sc.nextLine();
                System.out.println("nhập tải trọng");
                nhapTaiTrong = sc.nextLine();

                return new XeTai(nhapBienKiemSoat, nhapHangSanXuat, nhapNamSanXuat, nhapChuSoHuu, nhapTaiTrong);

        }

    }

    public static XeMay nhapXeMay(){
        String nhapHangSanXuat;
        String nhapNamSanXuat;
        String nhapChuSoHuu;
        String nhapBienKiemSoat;
        String nhapCongSuat;
        Scanner sc = new Scanner(System.in);

        while (true) {
                nhapBienKiemSoat = PhuongTienException.kiemTraBienXeMay();
                System.out.println("nhập hãng sản xuất");
                nhapHangSanXuat = sc.nextLine();
                System.out.println("nhập năm sản xuất");
                nhapNamSanXuat = sc.nextLine();
                System.out.println("nhập chủ sở hữu");
                nhapChuSoHuu = sc.nextLine();
                System.out.println("nhập công suất");
                nhapCongSuat = sc.nextLine();

                return new XeMay(nhapBienKiemSoat,nhapHangSanXuat,nhapNamSanXuat,nhapChuSoHuu,nhapCongSuat);
        }
    }
}
