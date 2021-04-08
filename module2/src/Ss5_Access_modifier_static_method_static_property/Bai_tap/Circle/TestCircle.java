package ss5_access_modifier_static_method_static_property.bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle =new Circle();
        circle.setRadius(4);
        double area = Math.floor(circle.getArea()*100)/100;
        System.out.println("Diện tích hình tròn là "+area);
    }
}
