package ontapoop.models;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String bac) {
        this.bac = bac;
    }

    public CongNhan(String id, String hoTen, String namSinh, String gioiTinh, String diaChi, String bac) {
        super(id, hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "," + bac;
    }

    @Override
    public void hienThi() {
        System.out.println("Công nhân" +
                ", id ='" + id + '\'' +
                ", họ tên ='" + hoTen + '\'' +
                ", năm sinh ='" + namSinh + '\'' +
                ", giới tính ='" + gioiTinh + '\'' +
                ", địa chỉ ='" + diaChi + '\'' +
                ", bậc ='" + bac + '\'');
    }
}
