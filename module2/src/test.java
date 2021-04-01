import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        password = sc.nextLine();
        do {
            System.out.println("nhập password");
            password = sc.nextLine();
        } while (!password.equals("vung oi mo ra"));
    }
}
