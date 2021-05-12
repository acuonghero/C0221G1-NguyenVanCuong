package thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cach_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {


    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getArea() > o2.getArea()){
            return 1;
        }
        else if (o1.getArea() < o2.getArea()){
            return -1;
        }
        else return 0;
    }
}
