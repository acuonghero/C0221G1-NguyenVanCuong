package Ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class Su_dung_toan_tu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter height: ");
        height = Float.parseFloat(scanner.nextLine());

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
