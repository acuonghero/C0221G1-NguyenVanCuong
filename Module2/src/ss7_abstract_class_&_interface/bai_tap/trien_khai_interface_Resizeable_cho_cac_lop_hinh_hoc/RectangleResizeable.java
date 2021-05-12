package bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;

public class RectangleResizeable extends Rectangle implements Resizeable {
    @Override
    public void resize(double percent) {
        super.setLength(getLength()*percent/100);
        super.setWidth(getWidth()*percent/100);
    }
}
