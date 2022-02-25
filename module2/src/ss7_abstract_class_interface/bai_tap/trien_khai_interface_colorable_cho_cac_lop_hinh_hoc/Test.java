package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Rectangle rectangle1 = new Rectangle();
        Square square1 = new Square();

        Shape[] shapes = {circle1, rectangle1, square1};

        for (Shape element : shapes) {
            if (element instanceof Circle) {
                System.out.println(element);
                System.out.println("Diện tích ban đầu: " + ((Circle) element).getArea());
                ((Circle) element).resize(50);
                System.out.println("Diện tích sau: " + ((Circle) element).getArea());
            } else if (element instanceof Rectangle) {
                System.out.println(element);
                System.out.println("Diện tích ban đầu: " + ((Rectangle) element).getArea());
                ((Rectangle) element).resize(50);
                System.out.println("Diện tích sau: " + ((Rectangle) element).getArea());
            } else if (element instanceof Square) {
                System.out.println(element);
                System.out.println("Diện tích ban đầu: " + ((Square) element).getArea());
                ((Square) element).resize(80);
                System.out.println("Diện tích sau: " + ((Square) element).getArea());
            }
        }

    }
}
