package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;


public class Lop_hinh_chu_nhat {
    double width, height;

    public Lop_hinh_chu_nhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //code below here

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


}



