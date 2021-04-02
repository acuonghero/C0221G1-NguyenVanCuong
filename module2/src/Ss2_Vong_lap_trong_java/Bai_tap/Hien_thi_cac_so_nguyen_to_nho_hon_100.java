package Ss2_Vong_lap_trong_java.Bai_tap;

import java.util.Scanner;

public class Hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static boolean kiemTraSoNguyenTo(double num) {
        boolean check = true;

        if (num < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In số nguyên tố nhỏ hơn ");
        int n = scanner.nextInt();
        System.out.printf("Số nguyên tố nhỏ hơn %d là \n",n);
        int i = 2;
        while (i < n) {
            if (kiemTraSoNguyenTo(i)) {
                System.out.println(i);
            }
            i++;
        }
    }
}


