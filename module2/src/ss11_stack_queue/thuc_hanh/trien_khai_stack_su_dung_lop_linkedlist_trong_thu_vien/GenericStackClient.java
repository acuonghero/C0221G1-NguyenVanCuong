package ss11_stack_queue.thuc_hanh.trien_khai_stack_su_dung_lop_linkedlist_trong_thu_vien;

import static ss11_stack_queue.thuc_hanh.trien_khai_stack_su_dung_lop_linkedlist_trong_thu_vien.MyGenericStack.stackOfIStrings;
import static ss11_stack_queue.thuc_hanh.trien_khai_stack_su_dung_lop_linkedlist_trong_thu_vien.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
