package quanlyhocsinh.models;

public class Student extends Person {
    private String maLop;

    public Student() {
    }

    public Student(String maLop) {
        this.maLop = maLop;
    }

    public Student(String ten, String ngaySinh, String gioiTinh, String soDienThoai, String maLop) {
        super(ten, ngaySinh, gioiTinh, soDienThoai);
        this.maLop = maLop;


    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "," + maLop;
//    }


    @Override
    public String toString() {
        return super.toString()+","+ maLop;
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());;
    }
}
