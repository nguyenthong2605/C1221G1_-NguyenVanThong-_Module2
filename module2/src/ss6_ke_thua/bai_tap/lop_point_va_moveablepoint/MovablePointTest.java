package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint();
        System.out.println("movablePoint1"+movablePoint1);
        MovablePoint movablePoint2 = new MovablePoint(1,2);
        movablePoint2.move();
        movablePoint2.move();
        movablePoint2.move();
        System.out.println("movablePoint2"+movablePoint2);

    }
}
