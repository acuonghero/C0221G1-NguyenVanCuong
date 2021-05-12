package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //code below here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

        Lop_hinh_chu_nhat rectangle = new Lop_hinh_chu_nhat(width, height);

        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());

    }
}
