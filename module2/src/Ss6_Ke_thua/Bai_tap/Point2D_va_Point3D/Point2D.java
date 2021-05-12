package ss6_ke_thua.bai_tap.point2D_va_point3D;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    Point2D() {

    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

//    public static void main(String[] args) {
//        Point2D point2D = new Point2D(3, 4);
//        System.out.println(point2D);
//    }
}
