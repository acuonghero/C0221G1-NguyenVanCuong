package thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cach_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Squares;

import java.util.Comparator;

public class SquareComparator implements Comparator<Squares> {
    @Override
    public int compare(Squares o1, Squares o2) {
        if (o1.getPerimeter() > o2.getPerimeter()){
            return 1;
        }else if(o1.getPerimeter()<o2.getPerimeter()){
            return -1;
        }else return 0;
    }
}
