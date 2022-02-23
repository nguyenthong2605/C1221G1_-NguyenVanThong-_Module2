package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class TestCricle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getArea());
        System.out.println(circle1.getRadius());
        Circle circle2 = new Circle(5);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getRadius());
    }
}
