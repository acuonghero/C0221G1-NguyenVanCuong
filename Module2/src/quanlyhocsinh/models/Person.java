package quanlyhocsinh.models;

public abstract class Person {
    protected String ten ;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String soDienThoai;

    public Person() {
    }

    public Person(String ten, String ngaySinh, String gioiTinh, String soDienThoai) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return  ten +
                "," + ngaySinh  +
                "," + gioiTinh  +
                "," + soDienThoai ;
    }

    public abstract void showInfo();
}
