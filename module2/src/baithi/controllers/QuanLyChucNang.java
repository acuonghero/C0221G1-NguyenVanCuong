package baithi.controllers;


import baithi.commons.GhiDocFileDanhBa;
import baithi.models.DanhBa;
import ontapoop.commons.DocGhiFile;
import ontapoop.models.CanBo;
import quanlyhocsinh.commons.GhiDocFile;
import quanlyhocsinh.commons.PersonException;
import quanlyhocsinh.models.Person;
import quanlyhocsinh.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner sc = new Scanner(System.in);
    public static void xemDanhSach() {
        for (DanhBa danhBa : GhiDocFileDanhBa.docFile("contacts.csv")) {
            System.out.println(danhBa.toString());
        }
    }
    public static void capNhat(){
        String nhap = null;
        do {

            try {
                System.out.println("Nhập số điện thoại của danh bạ cần sửa");
                nhap = sc.nextLine();
                List<DanhBa> danhBaList = GhiDocFileDanhBa.docFile("contacts.csv");
                for (int i = 0;i<danhBaList.size();i++) {
//
                    if (danhBaList.get(i).getSoDienThoai().equals(nhap)) {
                        System.out.println("Nhâp tên mới");
                        String ten = sc.nextLine();
                        System.out.println("nhập nhóm danh bạ mới");
                        String nhomDanhBa = sc.nextLine();
                        System.out.println("Nhập họ tên mới");
                        String hoTen = sc.nextLine();
                        System.out.println("nhập giới tính mới");
                        String gioiTinh = sc.nextLine();
                        System.out.println("nhập địa chỉ mới");
                        String diaChi = sc.nextLine();
                        System.out.println("nhập ngày sinh mới");
                        String ngaySinh = sc.nextLine();
                        String email = QuanLyNhap.nhapEmail();
                        danhBaList.get(i).setNhomDanhBa(nhomDanhBa);
                        danhBaList.get(i).setNgaySinh(ngaySinh);
                        danhBaList.get(i).setDiaChi(diaChi);
                        danhBaList.get(i).setHoTen(hoTen);
                        danhBaList.get(i).setGioiTinh(gioiTinh);
                        danhBaList.get(i).setEmail(email);

                        GhiDocFileDanhBa.ghiFile("contacts.csv",danhBaList,false);
                        return;
                    }
                }
                throw new PersonException("Không tồn tại");
            } catch (PersonException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }


    public static void xoa() {
        String nhap = null;
        do {
            try {
                System.out.println("nhap số điện thoại cần xóa");
                nhap = sc.nextLine();
                List<DanhBa> danhBaList = GhiDocFileDanhBa.docFile("contacts.csv");
                for (DanhBa danhBa : danhBaList) {
                    if (danhBa.getSoDienThoai().equals(nhap)) {
                        danhBaList.remove(danhBa);
                        System.out.println("Xóa thành công");
                        GhiDocFileDanhBa.ghiFile("contacts.csv",danhBaList,false);
                        return;
                    }
                }
                throw new PersonException("Không tồn tại");
            } catch (PersonException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public static void timKiem() {
        boolean kiemTra = false;
        String nhap = "";
        System.out.println("Nhập số điện thoại cần tìm");
        nhap = sc.nextLine();
        List<DanhBa> danhBaList = GhiDocFileDanhBa.docFile("contacts.csv");
        if (nhap == "") {
            System.out.println("số điện thoại này không tồn tại");
        } else {
            for (DanhBa danhBa : danhBaList) {
                if (danhBa.getSoDienThoai().contains(nhap)) {
                    System.out.println(danhBa);
                    kiemTra = true;
                }
            }
            if (kiemTra == false) {
                System.out.println("số điện thoại này không tồn tại");
            }
        }
    }

//    public static void hienThiDanhBa(){
//        List<DanhBa> danhBaList = GhiDocFileDanhBa.docFile("contacts.csv");
//
//    }

    public static void them() {
        Scanner sc = new Scanner(System.in);
        String soDienThoai;
        String nhomDanhBa;
        String hoTen;
        String gioiTinh;
        String diaChi;
        String ngaySinh;
        String email;

        soDienThoai = QuanLyNhap.nhapSoDienThoai();
        System.out.println("Nhập nhóm danh bạ");
        nhomDanhBa = sc.nextLine();
        System.out.println("Nhập họ tên");
        hoTen = sc.nextLine();
        System.out.println("Nhập giới tính");
        gioiTinh = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        diaChi = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        ngaySinh = sc.nextLine();
        email = QuanLyNhap.nhapEmail();
        DanhBa danhBa = new DanhBa(soDienThoai, nhomDanhBa, hoTen, gioiTinh, diaChi, ngaySinh, email);
        List<DanhBa> danhBaList = new ArrayList<>();
        danhBaList.add(danhBa);
        GhiDocFileDanhBa.ghiFile("contacts.csv", danhBaList, true);
    }
}
