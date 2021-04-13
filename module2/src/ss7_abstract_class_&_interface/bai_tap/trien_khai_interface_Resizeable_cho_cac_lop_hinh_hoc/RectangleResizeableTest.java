package bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

public class RectangleResizeableTest {
    public static void main(String[] args) {
        Circle circle = new CircleResizeable();
        circle.setRadius(5);
        ((CircleResizeable)circle).resize(200);
        System.out.println(circle);
    }
}
