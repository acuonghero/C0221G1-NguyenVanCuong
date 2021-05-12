package ss4_lop_va_doi_tuong_trong_java.bai_tap.fan;

public class Fan {
    final public int SLOW = 1;
    final public int MEDIUM = 2;
    final public int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius=radius;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Fan có tốc độ "+(speed==1?"Slow":speed==2?"Medium":speed==3?"Fast":"'Chỉ có 1,2,3'")+ " bán kính "+radius+" màu "+color+" trạng thái "+(on?"bật":"tắt");
    }
}
