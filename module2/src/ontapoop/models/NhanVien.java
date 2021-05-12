package ontapoop.models;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String id, String hoTen, String namSinh, String gioiTinh, String diaChi, String congViec) {
        super(id, hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + "," + congViec;
    }

    @Override
    public void hienThi() {
        System.out.println("Nhân viên" +
                ", id ='" + id + '\'' +
                ", họ tên ='" + hoTen + '\'' +
                ", năm sinh ='" + namSinh + '\'' +
                ", giới tính ='" + gioiTinh + '\'' +
                ", địa chỉ ='" + diaChi + '\'' +
                ", công việc ='" + congViec+ '\'');
    }
}
