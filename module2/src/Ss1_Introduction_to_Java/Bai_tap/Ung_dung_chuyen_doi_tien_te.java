package Ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class Ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền đô : \n");
        int USD = Integer.parseInt(scanner.nextLine());
        int VND = 23000;
        System.out.println("1 USD = 23000 VND");
        int result = USD*VND;

        System.out.printf("%dUSD đổi được %dVND",USD,result);
    }
}
