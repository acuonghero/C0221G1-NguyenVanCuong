package Ss1_Introduction_to_Java.Thuc_hanh;


import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("c: ");
        double c = Double.parseDouble(scanner.nextLine());

        if (a!=0){
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }
        else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }

    }
}
