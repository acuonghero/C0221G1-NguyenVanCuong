package ss12_java_collection_framework.bai_tap;

import ss12_java_collection_framework.thuc_hanh.cai_dat_cay_tim_kiem_nhi_phan.BST;

public class DeleteBST {
    public static void main(String[] args) {

        BST<String> tree1 = new BST<>();
        tree1.insert("George");
        tree1.insert("Michael");
        tree1.insert("Tom");
        tree1.insert("Adam");
        tree1.insert("Jones");
        tree1.insert("Peter");
        tree1.insert("Daniel");
        System.out.println("Inorder (sorted): ");


        tree1.deleteKey("Jones");
        tree1.postOrder();

    }
}
