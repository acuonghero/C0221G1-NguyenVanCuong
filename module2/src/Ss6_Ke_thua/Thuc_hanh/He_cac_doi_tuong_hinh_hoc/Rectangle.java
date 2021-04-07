package Ss6_Ke_thua.Thuc_hanh.He_cac_doi_tuong_hinh_hoc;

import java.awt.desktop.AboutEvent;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(){

    }

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", Area = "
                + Math.floor(getArea()*100)/100
                + ", Perimeter = "
                + Math.floor(getPerimeter()*100)/100
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(5);

        System.out.println(rectangle);
    }
}
