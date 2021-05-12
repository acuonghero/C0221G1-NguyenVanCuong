package thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cach_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Squares;

import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Squares[] square = new Squares[3];
        square[0] = new Squares(5, "red", true);
        square[1] = new Squares(6, "red", true);
        square[2] = new Squares(7, "red", true);

        System.out.println("Pre-sorted: ");
        for (Squares square1 : square) {
            System.out.println(square1);
        }
        Comparator squareComparator = new SquareComparator();
        Arrays.sort(square,squareComparator);
        System.out.println("After-sorted:");
        for (Squares square1 : square){
            System.out.println(square1);
        }
    }
}
