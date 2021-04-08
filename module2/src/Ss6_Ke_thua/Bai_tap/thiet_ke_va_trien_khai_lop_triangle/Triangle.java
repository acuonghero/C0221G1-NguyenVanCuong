package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Triangle extends Shape {
    protected double side1 = 1;
    protected double side2 = 1;
    protected double side3 = 1;

    Triangle(){

    }
    Triangle(double side1,double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        return 
    }
}
