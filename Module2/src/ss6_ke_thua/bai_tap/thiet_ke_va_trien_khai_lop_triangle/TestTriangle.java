package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side1 = 3;
        triangle.side2 = 4;
        triangle.side3 = 5;
        System.out.println(triangle);
        System.out.println("Area = " + Math.floor(triangle.getArea() * 100) / 100);
        System.out.println("Perimeter = " + triangle.getperimeter());
    }
}
