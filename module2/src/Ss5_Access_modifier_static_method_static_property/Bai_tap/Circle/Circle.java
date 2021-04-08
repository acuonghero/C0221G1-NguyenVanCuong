package ss5_access_modifier_static_method_static_property.bai_tap.circle;

public class Circle {
    private double radius =1.0;
    private String color = "red";

    Circle(){

    }
    Circle(double r){
        radius = r;
    }
    public void setRadius(double r){
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

//    public String toString(){
//        return "Diện tích hình tròn là : " + getArea();
//    }
}
