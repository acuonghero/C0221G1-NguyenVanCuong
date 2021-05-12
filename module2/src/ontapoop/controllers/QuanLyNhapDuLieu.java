package ontapoop.controllers;
import ontapoop.commons.CanBoException;
import ontapoop.commons.DocGhiFile;
import ontapoop.models.CanBo;

import java.util.List;
import java.util.Scanner;


public class QuanLyNhapDuLieu {
    //  id(Tự tăng CB-001)  , Họ tên, năm sinh, giới tính, địa chỉ, bậc, ngành đào tạo, công việc

    static Scanner sc = new Scanner(System.in);

    public static String nhapId(){
        String id = null;
        List<CanBo> canBoList = DocGhiFile.docFile("canBo.csv");
        if (canBoList.isEmpty()){
            id = "CB-001";
        }else {
            id = "CB-00"+(canBoList.size()+1);
        }
        return id;
    }

    public static String nhapHoTen(){
        String nhapHoTen = null;
        while (true){
            try{
                System.out.println("Nhập họ tên");
                nhapHoTen = sc.nextLine();
                CanBoException.kiemTraHoTen(nhapHoTen);
                return nhapHoTen;
            } catch (CanBoException e) {
                e.printStackTrace();
            }
        }
    }

    public static String nhapNamSinh(){
        String nhapNamSinh = null;
        while (true){
            try{
                System.out.println("Nhập năm sinh");
                nhapNamSinh = sc.nextLine();
                CanBoException.kiemTraNamSinh(nhapNamSinh);
                return nhapNamSinh;
            } catch (CanBoException e) {
                e.printStackTrace();
            }
        }
    }

    public static String nhapGioiTinh(){
        boolean kiemTra = false;
        String nhapGioiTinh = null;
        String chon = null;

        while (true){
            System.out.println("1 - Nam\n" + "2 - Nữ");
            chon = sc.nextLine();
            switch (chon){
                case "1":
                    nhapGioiTinh = "Nam";
                    kiemTra = true;
                    break;
                case "2":
                    nhapGioiTinh = "Nữ";
                    kiemTra = true;
                    break;
                default:
                    System.out.println("Vui lòng chọ 1 hoặc 2");
            }
            if (kiemTra){
                break;
            }

        }
        return nhapGioiTinh;
    }

    public static String nhapDiaChi() {
        String nhapDiaChi = null;
        while (true){
            try{
                System.out.println("Nhập địa chỉ");
                nhapDiaChi = sc.nextLine();
                CanBoException.kiemTraDiaChi(nhapDiaChi);
                return nhapDiaChi;
            } catch (CanBoException e) {
                e.printStackTrace();
            }
        }
    }
    public static String nhapNganhDaoTao(){
        boolean kiemTra = false;
        String chon  = null;
        String nhapNganhDaoTao = null;
        while (true){
            List<String> stringList = DocGhiFile.docNganhDaoTao("nganhDaoTao.csv");
            for (int i = 0;i <stringList.size();i++){
                System.out.println((i+1)+" : "+stringList.get(i));
            }
            System.out.println("chon theo danh sach");
            chon = sc.nextLine();
            if(chon==""){
                System.out.println("Vui lòng chọn theo danh sách");
            }else {
                for (int i =0 ;i < stringList.size();i++){
                    if (i ==  Integer.parseInt(chon)-1){
                        nhapNganhDaoTao = stringList.get(i).split(",")[1];
                        kiemTra= true;
                        break;
                    }
                }
                if (kiemTra){
                    break;
                }else {
                    System.out.println("Vui lòng chọn theo danh sách");
                }
            }

        }
        return nhapNganhDaoTao;
    }
    public static String nhapBac(){
        String nhapCapBac = null;
        while (true){
            try{
                System.out.println("Nhập bậc");
                nhapCapBac = sc.nextLine();
                CanBoException.kiemTraCapBac(nhapCapBac);
                return nhapCapBac;
            } catch (CanBoException e) {
                e.printStackTrace();
            }
        }
    }
    public static String nhapCongViec(){
        String nhapCongViec = null;
        boolean kiemTra = false;
        String chon = null;

        while (true){
            System.out.println("CHỌN CÔNG VIỆC\n"+
                    "1 - PV-trong nhà\n"+
                    "2 -  PV-ngoài trời");
            chon = sc.nextLine();
            switch (chon){
                case "1":
                    nhapCongViec = "PV-trong nhà";
                    kiemTra = true;
                    break;
                case "2":
                    nhapCongViec = "PV-ngoài trời";
                    kiemTra = true;
                    break;
                default:
                    System.out.println("Vui lòng chọn 1 hoặc 2");
            }
            if (kiemTra){
                break;
            }
        }
        return nhapCongViec;
    }
}
