package Ss5_Access_modifier_static_method_static_property.Thuc_hanh.Private;

public class A {
    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }

    public static void main(String args[]) {

        A obj = new A();
        obj.msg();

    }
}
