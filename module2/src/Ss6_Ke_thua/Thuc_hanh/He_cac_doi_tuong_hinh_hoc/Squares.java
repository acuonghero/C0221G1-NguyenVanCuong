package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Squares extends Shape {
    private double side = 1.0;

    Squares() {

    }

    Squares(double size) {
        this.side = size;
    }

    Squares(double size, String color, boolean filled) {
        super(color, filled);
        this.side = size;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", Area = "
                + Math.floor(getArea() * 100) / 100
                + ", Perimeter = "
                + Math.floor(getPerimeter() * 100) / 100
                + ", which is a subclass of "
                + super.toString();
    }


    public static void main(String[] args) {
        Squares squares = new Squares();
        System.out.println(squares);

        squares = new Squares(2.3);
        System.out.println(squares);

        squares = new Squares(5.8, "yellow", true);
        System.out.println(squares);
    }
}
