package Ss2_Vong_lap_trong_java.Bai_tap;

import java.util.Scanner;

public class Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = Integer.parseInt(input.nextLine());

        switch (choice) {
            case 1:
                System.out.println("1. In hình chữ nhật");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 2:
                System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
                for (int i = 5; i >= 1;  i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
