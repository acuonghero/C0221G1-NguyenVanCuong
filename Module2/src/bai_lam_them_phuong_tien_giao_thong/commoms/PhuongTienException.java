package bai_lam_them_phuong_tien_giao_thong.commoms;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhuongTienException extends Exception {
    private static Scanner sc = new Scanner(System.in);

    public PhuongTienException(String message) {
        super(message);
    }

    public static String kiemTraBienOTo()  {
        String nhap;
        do {
            try {
                String regex = "[0-9]{2}[A-B]-[0-9]{3}.[0-9]{2}";
                System.out.println("Nhập vào biển số ô tô");
                nhap = sc.nextLine();
                if (!Pattern.matches(regex, nhap)) {
                    throw new PhuongTienException("Biển ô tô sai định dạng \n"
                            + "Ôtô: XXY-XXX.XX (X : 0÷9 , Y=A nếu xe du lịch, Y=B  nếu xe khách)");
                }
                return nhap;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public static String kiemTraBienXeMay() {
        String nhap;
        do {
            try {
                String regex = "[0-9]{2}-[A-Z][0-9A-Z]-[0-9]{3}.[0-9]{2}";

                System.out.println("Nhập vào biển số xe máy");
                nhap = sc.nextLine();
                if (!Pattern.matches(regex, nhap)) {
                    throw new Exception("Biển xe máy sai định dạng \n" + "[0-9]{2}-[A-Z][0-9A-Z]-[0-9]{3}.[0-9]{2}");
                }else {
                    return nhap;
                }

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public static String kiemTraBienXeTai() {
        String nhap;
        do {
            try{
                String regex = "[0-9]{2}[C]-[0-9]{3}.[0-9]{2}";
                System.out.println("Nhập vào biển số xe tải");
                nhap = sc.nextLine();
                if(!Pattern.matches(regex,nhap)){
                    throw new Exception("Biển số xe máy sai định dạng \n"+"[0-9]{2}[C]-[0-9]{3}.[0-9]{2}");
                }else{
                    return nhap;
                }
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }while (true);
    }


}
