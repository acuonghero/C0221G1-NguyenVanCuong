package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class Point {
    private float x;
    private float y;

    Point(){

    }
    Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[2];
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
