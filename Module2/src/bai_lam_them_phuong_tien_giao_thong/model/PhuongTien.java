package bai_lam_them_phuong_tien_giao_thong.model;

public abstract class PhuongTien {
    protected String bienKiemSoat;
    protected String tenHangSanXuat;
    protected String namSanXuat;
    protected String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return  bienKiemSoat +
                "," + tenHangSanXuat +
                "," + namSanXuat +
                "," + chuSoHuu;
    }

   public abstract void hienThi();
}
