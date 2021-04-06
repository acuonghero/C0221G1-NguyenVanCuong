package Ss4_Lop_va_doi_tuong_trong_java.Bai_tap.Fan;


public class test {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setOn(true);
        fan1.setColor("yellow");
        fan1.setRadius(10);

        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.MEDIUM);


        System.out.println(fan1);
        System.out.println(fan2);
    }

}
