package ontapoop.views;

import ontapoop.controllers.MenuChucNang;
import ontapoop.models.CanBo;
import ontapoop.models.KySu;
import ontapoop.models.NhanVien;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        MenuChucNang.menu();
        CanBo canBo = new NhanVien();

        ((NhanVien)canBo).getCongViec();
        ((KySu)canBo).getNganhDaoTao();
    }
}
