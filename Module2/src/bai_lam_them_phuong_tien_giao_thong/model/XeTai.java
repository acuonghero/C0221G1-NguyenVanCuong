package bai_lam_them_phuong_tien_giao_thong.model;

public class XeTai extends PhuongTien {

    private String trongTai;

    public XeTai() {
    }

    public XeTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + trongTai ;
    }



    @Override
    public void hienThi() {
        System.out.println("Xe tải {" +
                " biển kiểm soát ='" + bienKiemSoat + '\'' +
                ", ttên hãng sản xuất ='" + tenHangSanXuat + '\'' +
                ", năm sản xuất ='" + namSanXuat + '\'' +
                ", chủ sở hữu ='" + chuSoHuu + '\'' +
                " trọng tải ='" + trongTai + '\'' +
                '}');
    }

}
