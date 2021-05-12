package baithi.controllers;

import baithi.commons.DanhBaException;

import ontapoop.commons.CanBoException;

import java.util.Scanner;

public class QuanLyNhap {
    static Scanner sc = new Scanner(System.in);
    public static String nhapSoDienThoai(){
        String nhapSoDienThoai = null;
        while (true){
            try{
                System.out.println("Nhập số điện thoai");
                nhapSoDienThoai = sc.nextLine();
                DanhBaException.kiemTraSoDienThoai(nhapSoDienThoai);
                return nhapSoDienThoai;
            } catch (DanhBaException e) {
                e.printStackTrace();
            }
        }
    }
    public static String nhapEmail(){
        String nhapEmail = null;
        while (true){
            try{
                System.out.println("Nhập Email");
                nhapEmail = sc.nextLine();
                DanhBaException.kiemTraEmail(nhapEmail);
                return nhapEmail;
            } catch (DanhBaException e) {
                e.printStackTrace();
            }
        }
    }
}
