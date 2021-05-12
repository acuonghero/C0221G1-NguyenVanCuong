package ss12_java_collection_framework.bai_tap;

public class BST {
    public static void main(String[] args) {
        //create a BST
        ss12_java_collection_framework.thuc_hanh.cai_dat_cay_tim_kiem_nhi_phan.BST<String> tree = new ss12_java_collection_framework.thuc_hanh.cai_dat_cay_tim_kiem_nhi_phan.BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
