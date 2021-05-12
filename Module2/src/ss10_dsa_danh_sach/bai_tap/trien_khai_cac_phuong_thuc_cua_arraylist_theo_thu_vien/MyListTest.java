package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien;

public class MyListTest {
    public static class Student {
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

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "nam");
        Student b = new Student(2, "nam1");
        Student c = new Student(3, "nam2");
        Student d = new Student(4, "nam3");
        Student e = new Student(5, "nam4");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);



        for (int i = 0; i < studentMyList.size() && studentMyList.get(i) != null; i++) {
            System.out.println(studentMyList.get(i));
        }
    }
}
