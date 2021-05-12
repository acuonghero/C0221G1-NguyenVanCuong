package bai_lam_them_phuong_tien_giao_thong.model;

public class XeMay extends PhuongTien {

    private String congSuat;

    public XeMay() {
    }

    public XeMay(String congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + congSuat ;
    }

    @Override
    public void hienThi() {
        System.out.println("Xe máy {" +
                " biển kiểm soát ='" + bienKiemSoat + '\'' +
                ", tên hãng sản xuất ='" + tenHangSanXuat + '\'' +
                ", năm sản xuất ='" + namSanXuat + '\'' +
                ", chủ sở hữu ='" + chuSoHuu + '\'' +
                "công suất ='" + congSuat + '\'' +
                '}');
    }
}
