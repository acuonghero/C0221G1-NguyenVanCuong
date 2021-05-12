package ss12_java_collection_framework.bai_tap;

import ss12_java_collection_framework.thuc_hanh.cai_dat_cay_tim_kiem_nhi_phan.BST;

public class PostorderBinaryTree {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        System.out.println("postorder (sorted): ");
        tree.postOrder();

        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
