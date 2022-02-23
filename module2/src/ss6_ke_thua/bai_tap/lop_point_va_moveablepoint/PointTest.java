package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

import ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d.Point2D;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point();
        System.out.println("point1"+point1);
        Point point2 = new Point(3.1f,2.3f);
        System.out.println("point2" + point2);
        Point point3 = new Point();
        System.out.println("point3"+ Arrays.toString(point3.getXY()));
        point3.setXY(3,2);
        System.out.println("point3"+Arrays.toString(point3.getXY()));
    }
}
