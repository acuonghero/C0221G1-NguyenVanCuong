package Ss2_Vong_lap_trong_java.Bai_tap;

public class Hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        int n = 2;
        int count = 0;

        String kQ = "";
        do {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                kQ += n + "  ";
                count++;

            }
            n++;
        } while (count < 20);
        System.out.print(kQ);
    }
}
