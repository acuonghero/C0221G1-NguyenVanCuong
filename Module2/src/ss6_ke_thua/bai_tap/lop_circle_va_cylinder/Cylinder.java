package ss6_ke_thua.bai_tap.lop_circle_va_cylinder;

public class Cylinder extends Circle {
    private double height;

    Cylinder() {

    }

    Cylinder(double height) {
        this.height = height;
    }

    Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getTheTich() {
        return getRadius() * getRadius() * height * Math.PI;
    }

    public String toString() {
        return super.toString()
                + ", chiều cao : "
                + height
                + ", thể tích : "
                + Math.floor(getTheTich() * 100) / 100;
    }
}
