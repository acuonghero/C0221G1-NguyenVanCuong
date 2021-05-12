package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    MovablePoint() {

    }

    MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[2];
    }

    public MovablePoint move() {
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
      return this;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Speed=("
                + xSpeed
                + ", "
                + ySpeed
                + ")";
    }
}
