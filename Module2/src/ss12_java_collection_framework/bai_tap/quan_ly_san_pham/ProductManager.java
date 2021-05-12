package ss12_java_collection_framework.bai_tap.quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class ProductManager {

    static ArrayList<Product> productList = new ArrayList<>();

    public static void add() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        productList.add(new Product(name, id, price));

    }

    static Scanner scanner = new Scanner(System.in);

    public static void edit() {
        System.out.println("Nhập vào id muốn tìm");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : productList) {
            if (product.getId() == id) {
                System.out.println("Nhập tên mới");
                String name = scanner.nextLine();
                System.out.println("Nhập giá mới");
                int price = Integer.parseInt(scanner.nextLine());
                product.setName(name);
                product.setPrice(price);
                return;
            }
        }
        System.out.println("Không tìm thấy id");
    }

    public static void delete() {
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                return;
            }
        }
        System.out.println("Không tìm thấy id");
    }

    public static void display() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void search() {
        System.out.println("nhập tên muốn tìm");
        String name = scanner.nextLine();
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
        System.out.println("Không tìm thấy tên");
    }

    public static void sortUp() {
        productList.sort(Comparator.comparing(Product::getPrice));
        System.out.println(productList);
    }

    public static void sortDown() {
        productList.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println(productList);
    }
    public static void main(String[] args) {
        int choose;

        do {
            System.out.println("Chọn: " +
                    "\n1. Thêm sản phẩm" +
                    "\n2. Sửa thông tin sản phẩm theo id" +
                    "\n3. Xóa sản phẩm theo id" +
                    "\n4. Hiển thị danh sách sản phẩm" +
                    "\n5. Tìm kiếm sản phẩm theo tên" +
                    "\n6. sắp xếp tăng dần theo giá" +
                    "\n7. Sắp xếp giảm dần theo giá" +
                    "\n8. Thoát");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    sortUp();
                    break;
                case 7:
                    sortDown();
                    break;
            }
        } while (choose != 8);
    }
}
