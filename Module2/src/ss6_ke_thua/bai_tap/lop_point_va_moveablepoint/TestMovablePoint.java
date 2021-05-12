package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setxSpeed(5);
        movablePoint.setySpeed(6);
        System.out.println(movablePoint.move());
    }
}
