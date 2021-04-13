package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student = new Student(1,"nam");
        Student student1 = new Student(2,"cuong");
        Student student2 = new Student(3,"hau");
        Student student3 = new Student(4,"khanh");

        myLinkedList.addFirst(student);
        myLinkedList.addFirst(student1);
        myLinkedList.addLast(student2);
        myLinkedList.add(2,student3);

        myLinkedList.remove(2);

        for (int i = 0; i < myLinkedList.size() ; i++) {
            Student student4 = (Student)myLinkedList.get(i);
            System.out.println(student4.getName());
        }
    }
}
