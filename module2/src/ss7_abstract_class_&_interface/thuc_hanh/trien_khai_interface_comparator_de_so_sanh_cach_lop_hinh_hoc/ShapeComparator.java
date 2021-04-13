package thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cach_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;


import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.getColor().compareToIgnoreCase(o2.getColor());
    }
}
