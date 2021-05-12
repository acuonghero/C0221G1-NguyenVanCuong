package ontapoop.controllers;

import ontapoop.commons.DocGhiFile;
import ontapoop.models.CanBo;
import ontapoop.models.CongNhan;
import ontapoop.models.KySu;
import ontapoop.models.NhanVien;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyChucNangThem {
    static Scanner sc = new Scanner(System.in);

    public static void themNhanVien(){
        String id = QuanLyNhapDuLieu.nhapId();
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String namSinh = QuanLyNhapDuLieu.nhapNamSinh();
        String gioiTinh = QuanLyNhapDuLieu.nhapGioiTinh();
        String diaChi = QuanLyNhapDuLieu.nhapDiaChi();
        String congViec = QuanLyNhapDuLieu.nhapCongViec();

        NhanVien nhanVien = new NhanVien();
        nhanVien.setId(id);
        nhanVien.setCongViec(congViec);
        nhanVien.setDiaChi(diaChi);
        nhanVien.setGioiTinh(gioiTinh);
        nhanVien.setHoTen(hoTen);
        nhanVien.setNamSinh(namSinh);

        List<CanBo> canBoList = new ArrayList<>();
        canBoList.add(nhanVien);
        DocGhiFile.ghiFile("canBo.csv",canBoList,true);

    }
    public static void themCongNhan(){
        String id = QuanLyNhapDuLieu.nhapId();
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String namSinh = QuanLyNhapDuLieu.nhapNamSinh();
        String gioiTinh = QuanLyNhapDuLieu.nhapGioiTinh();
        String diaChi = QuanLyNhapDuLieu.nhapDiaChi();
        String bac = QuanLyNhapDuLieu.nhapBac();

        CongNhan congNhan = new CongNhan(id,hoTen,namSinh,gioiTinh,diaChi,bac);
        List<CanBo> canBoList = new ArrayList<>();
        canBoList.add(congNhan);
        DocGhiFile.ghiFile("canBo.csv",canBoList,true);
    }
    public static void themKySu(){
        String id = QuanLyNhapDuLieu.nhapId();
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String namSinh = QuanLyNhapDuLieu.nhapNamSinh();
        String gioiTinh = QuanLyNhapDuLieu.nhapGioiTinh();
        String diaChi = QuanLyNhapDuLieu.nhapDiaChi();
        String nganhDaoTAo = QuanLyNhapDuLieu.nhapNganhDaoTao();

        KySu kySu =new KySu(id,hoTen,namSinh,gioiTinh,diaChi,nganhDaoTAo);
        List<CanBo> canBoList = new ArrayList<>();
        canBoList.add(kySu);
        DocGhiFile.ghiFile("canBo.csv",canBoList,true);
    }
}
