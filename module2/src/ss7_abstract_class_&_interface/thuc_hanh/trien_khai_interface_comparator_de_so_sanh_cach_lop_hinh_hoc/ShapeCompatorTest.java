package thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cach_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeCompatorTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]=new Shape("red",true);
        shapes[1]=new Shape("blue",true);
        shapes[2]=new Shape("pink",false);

        System.out.println("Pre-sorted: ");
        for (Shape shape : shapes){
            System.out.println(shape);
        }

        Comparator shapeComparator = new ShapeComparator();
        Arrays.sort(shapes,shapeComparator);
        System.out.println("After-sorted:");
        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }
}
