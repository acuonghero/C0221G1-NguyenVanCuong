package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(E element) {
        head = new Node(element);
    }

    void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next=temp;
        numNodes++;
    }

    void addLast(E e) {
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
        }

    }

    void remove(int index) {
    }

    boolean remove(Object e) {
    }

    public int size() {
        return size();
    }

    E clone() {

    }

    boolean contains(E e) {
    }

    int indexOf(E o) {
    }

    boolean add(E o) {
    }

    void ensureCapacity(int minCapacity) {
    }

    E get(int i) {
    }

    E getfirst() {
    }

    E getLast() {
    }

    void clear() {
        for (E e : )
    }

}
