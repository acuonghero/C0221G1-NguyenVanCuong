package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien;

public class MyLinkedList<E> {
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes;

    public MyLinkedList() {

    }

    public void addFirst(E element) {
        Node temp = head;
        //biến head sẽ nhận một giá trị là node mới
        head = new Node(element);
        // head.next trỏ đến temp
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        //sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        // Node tại ví trí index -1 trỏ tới node mới
        temp.next = new Node(element);
        //node mới trỏ đến holder
        temp.next.next = holder;
        numNodes++;
    }

    public Object get(int index) {
        //khai báo temp trỏ tới head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index");
        }
        Node temp = head;
        Object data = null;
        //nếu index = 0 thì sẽ trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                data = temp.next.data;
                temp.next = temp.next.next;
                numNodes--;
            }
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //Remove đối tượng nếu nó là element head
        if (head.data.equals(element)) {
            remove(0);
        } else {
            //Khai báo 1 node temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                //Nếu như tồn tại 1 phần tử bằng data truyền vào thì node đó sẽ bị xóa
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }
}
