package quanlyhocsinh.controllers;

import quanlyhocsinh.commons.GhiDocFile;
import quanlyhocsinh.commons.PersonException;
import quanlyhocsinh.models.Person;
import quanlyhocsinh.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {
    static Scanner sc = new Scanner(System.in);

    public static void hienThi() {
        for (Person person : GhiDocFile.docFile("person.csv")) {
            person.showInfo();
        }
    }

    public static void them() {
        Student person = new Student();
        String ten = themThuocTinh("ten", "^[A-Z][a-z]*$");
        String ngaySinh = themThuocTinh("Ngay sinh", "^[0-9]$");
        String maLop = themThuocTinh("Ma lop", "^([1-9]|[1][0-2])[A-Z]$");
        String gioiTinh = themThuocTinh("Gioi tinh", "^[A-Z][a-z][a-z]$");
        String soDienthoai = themThuocTinh("So dien thoai", "^[0-9]{10}$");

        person.setTen(ten);
        person.setNgaySinh(ngaySinh);
        person.setMaLop(maLop);
        person.setGioiTinh(gioiTinh);
        person.setSoDienThoai(soDienthoai);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        GhiDocFile.ghiFile("person.csv", personList, true);

    }

    public static String themThuocTinh(String property, String regex) {
        String input;
        do {
            try {
                System.out.println("nhap " + property + ": " + regex);
                input = sc.nextLine();
                PersonException.checkFormat(property, input, regex);
                break;
            } catch (PersonException e) {
                e.printStackTrace();
            }
        } while (true);
        return input;
    }

    public static void xoa() {
        String nhap = null;
        do {

            try {
                System.out.println("nhap ten can xoa");
                nhap = sc.nextLine();
                List<Person> personList = GhiDocFile.docFile("person.csv");
                for (Person person : personList) {
                    if (person.getTen().equals(nhap)) {
                        personList.remove(person);
                        System.out.println("xoa thanh cong");
                        GhiDocFile.ghiFile("person.csv", personList, false);
                        return;
                    }
                }
                throw new PersonException("Khong ton tai");
            } catch (PersonException e) {

                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public static void timKiem() {
        String nhap = null;
        do {

            try {
                System.out.println("nhap ten can tim");
                nhap = sc.nextLine();
                List<Person> personList = GhiDocFile.docFile("person.csv");
                for (Person person : personList) {
                    if (person.getTen().equals(nhap)) {
                        person.showInfo();
                        return;
                    }
                }
                throw new PersonException("Khong ton tai");
            } catch (PersonException e) {

                System.err.println(e.getMessage());
            }
        } while (true);
    }
    public static void sua(){
        String nhap = null;
        do {

            try {
                System.out.println("nhap ten can sua");
                nhap = sc.nextLine();
                List<Person> personList = GhiDocFile.docFile("person.csv");
                for (int i = 0;i<personList.size();i++) {
//                   personList.get(i).showInfo();
                    if (personList.get(i).getTen().equals(nhap)) {
                        String ten = themThuocTinh("ten", "^[A-Z][a-z]*$");
                        String ngaySinh = themThuocTinh("Ngay sinh", "^[0-9]$");
                        String maLop = themThuocTinh("Ma lop", "^([1-9]|[1][0-2])[A-Z]$");
                        String gioiTinh = themThuocTinh("Gioi tinh", "^[A-Z][a-z]$");
                        String soDienthoai = themThuocTinh("So dien thoai", "^[0-9]{10}$");
                        personList.get(i).setTen(ten);
                        personList.get(i).setNgaySinh(ngaySinh);
                        ((Student)personList.get(i)).setMaLop(maLop);
                        personList.get(i).setTen(soDienthoai);
                        personList.get(i).setGioiTinh(gioiTinh);

                        GhiDocFile.ghiFile("person.csv",personList,true);
                        return;
                    }
                }
                throw new PersonException("Khong ton tai");
            } catch (PersonException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }
}
