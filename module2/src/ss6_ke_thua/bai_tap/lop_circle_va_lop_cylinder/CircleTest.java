package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(5,"blue");
        System.out.println("circle2");
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getColor());
        System.out.println(circle2.getArea());
    }
}
