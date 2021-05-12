package ontapoop.models;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String id, String hoTen, String namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(id, hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + nganhDaoTao;
    }


    @Override
    public void hienThi() {
        System.out.println("Kỹ sư" +
                ", id ='" + id + '\'' +
                ", họ tên ='" + hoTen + '\'' +
                ", năm sinh ='" + namSinh + '\'' +
                ", giới tính ='" + gioiTinh + '\'' +
                ", địa chỉ ='" + diaChi + '\'' +
                ", ngành đào tạo ='" + nganhDaoTao+ '\'');
    }
}
