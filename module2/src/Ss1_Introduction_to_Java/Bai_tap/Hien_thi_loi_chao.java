package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Hien_thi_loi_chao {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
