package thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cach_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle(3,4);
        rectangle[1] = new Rectangle(2,4);
        rectangle[2] = new Rectangle(3,5);

        System.out.println("Pre-sorted: ");
        for (Rectangle rectangle1 : rectangle){
            System.out.println(rectangle1);
        }

        Comparator rectangleComparator = new RectangleComparator();

        Arrays.sort(rectangle,rectangleComparator);
        System.out.println("After-sorted:");
        for (Rectangle rectangle1 : rectangle) {
                System.out.println(rectangle1);
        }
    }

}
