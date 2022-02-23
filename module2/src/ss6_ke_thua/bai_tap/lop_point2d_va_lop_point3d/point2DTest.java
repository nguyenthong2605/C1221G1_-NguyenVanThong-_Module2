package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class point2DTest {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D();
        System.out.println("point2D1"+point2D1);
        Point2D point2D2 = new Point2D(6.5f,7.6f);
        System.out.println("point2D2" + point2D2);
        Point2D point2D3 = new Point2D();
        System.out.println("point2D3"+Arrays.toString(point2D3.getXY()));
        point2D3.setXY(2,8);
        System.out.println("point2D3"+Arrays.toString(point2D3.getXY()));
    }
}
