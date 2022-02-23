package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D1 = new Point3D();
        System.out.println("point3D1"+point3D1);
        Point3D point3D2 = new Point3D(1,2,3);
        System.out.println("point3D2"+point3D2);
        Point3D point3D3 = new Point3D();
        System.out.println("point3D3"+ Arrays.toString(point3D3.getXYZ()));
        point3D3.setXYZ(4,5,6);
        System.out.println("point3D3"+Arrays.toString(point3D3.getXYZ()));
    }
}
