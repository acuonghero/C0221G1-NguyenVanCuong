package bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Squares;

public class SquareResizeableTest {
    public static void main(String[] args) {
        Squares square = new SquareResizeable();
        square.setSide(5);
        ((SquareResizeable)square).resize(200);
        System.out.println(square);
    }
}
