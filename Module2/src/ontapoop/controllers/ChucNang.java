package ontapoop.controllers;


import ontapoop.commons.DocGhiFile;
import ontapoop.models.CanBo;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ChucNang {
    static Scanner sc = new Scanner(System.in);

    public static void themCanBo() {

        String chon = null;
        while (true) {
            try {
                System.out.println("DANH SÁCH CÁN BỘ\n" +
                        "1 - Công nhân\n" +
                        "2 - Kỹ sư\n" +
                        "3 - Nhân viên\n" +
                        "4 - Quay lại danh mục trước\n" +
                        "5 - Thoát");
                chon = sc.nextLine();
                switch (chon) {
                    case "1":
                        QuanLyChucNangThem.themCongNhan();
                        break;
                    case "2":
                        QuanLyChucNangThem.themKySu();
                        break;
                    case "3":
                        QuanLyChucNangThem.themNhanVien();
                        break;
                    case "4":
                        MenuChucNang.menu();
                        break;
                    case "5":
                        System.exit(0);

                    default:
                        System.out.println("Vui lòng chọn lại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void timKiem() {
        boolean kiemTra = false;
        String nhap = "";
        System.out.println("Nhập tên cần tìm");
        nhap = sc.nextLine();
        List<CanBo> canBoList = DocGhiFile.docFile("canBo.csv");
        if (nhap == "") {
            System.out.println("Tên này không tồn tại");
        } else {
            for (CanBo canBo : canBoList) {
                if (canBo.getHoTen().toUpperCase().indexOf(nhap.toUpperCase()) >= 0) {
                    System.out.println(canBo);
                    kiemTra = true;
                }
            }
            if (kiemTra == false) {
                System.out.println("Tên này không tồn tại");
            }
        }
    }

    public static void sapXep() {
        List<CanBo> canBoList = DocGhiFile.docFile("canBo.csv");
        canBoList.sort(Comparator.comparing(CanBo::getHoTen));
        for (CanBo canBo : canBoList) {
            canBo.hienThi();
        }
    }

    public static void xoa() {
        boolean kiemTra = false;
        String chon = null;
        List<CanBo> canBoList = DocGhiFile.docFile("canBo.csv");
        while (true) {
            try {
                for (int i = 0; i < canBoList.size(); i++) {
                    System.out.println((i + 1) + " : " + canBoList.get(i));
                }
                System.out.println("Chọn vị trí cần xóa");
                chon = sc.nextLine();
                for (int i = 0; i < canBoList.size(); i++) {
                    if (i == Integer.parseInt(chon) - 1) {
                        canBoList.remove(i);
                        DocGhiFile.ghiFile("canBo.csv", canBoList, false);
                        kiemTra = true;
                    }
                }
                if (kiemTra) {
                    break;
                } else {
                    System.out.println("vui long chon theo danh sach");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

    }

    public static void hienThiCanBo(){
        List<CanBo> canBoList = DocGhiFile.docFile("canBo.csv");
        for (CanBo canBo : canBoList){
            canBo.hienThi();
        }
    }

}
