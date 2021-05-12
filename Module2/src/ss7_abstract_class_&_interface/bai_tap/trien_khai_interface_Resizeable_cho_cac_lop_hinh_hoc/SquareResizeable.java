package bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Squares;

public class SquareResizeable extends Squares implements Resizeable {
    @Override
    public void resize(double percent) {
        super.setSide(getSide()*percent/100);
    }
}
