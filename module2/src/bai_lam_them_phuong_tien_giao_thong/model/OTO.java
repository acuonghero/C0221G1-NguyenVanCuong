package bai_lam_them_phuong_tien_giao_thong.model;

public class OTo extends PhuongTien {

    private String soChoNgoi;
    private String kieuXe;

    public OTo() {
    }

    public OTo(String soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public OTo(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public String getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public void hienThi() {
        System.out.println("Ô Tô {" +
                " biển kiểm soát ='" + bienKiemSoat + '\'' +
                ", tên hảng sản xuất ='" + tenHangSanXuat + '\'' +
                ", năm sản xuất='" + namSanXuat + '\'' +
                ", chủ sở hữu ='" + chuSoHuu + '\'' +
                ", kiểu xe ='" + kieuXe + '\'' +
                "số chỗ ngồi ='" + soChoNgoi + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return  super.toString()+ "," + kieuXe +
                "," + soChoNgoi ;
    }
}


