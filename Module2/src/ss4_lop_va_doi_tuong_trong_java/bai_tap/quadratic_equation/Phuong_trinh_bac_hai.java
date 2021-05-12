package ss4_lop_va_doi_tuong_trong_java.bai_tap.quadratic_equation;

public class Phuong_trinh_bac_hai {
    private double a , b, c;

    public Phuong_trinh_bac_hai(){}

    public Phuong_trinh_bac_hai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return b * b - 4 * a * c;
    }

    public String toString() {
        if (getDelta() > 0) {
            return "Có 2 nghiệm";
        } else if (getDelta() == 0) {
            return "có 1 nghiệm";
        } else {
            return "vô nghiệm";
        }
    }
}
