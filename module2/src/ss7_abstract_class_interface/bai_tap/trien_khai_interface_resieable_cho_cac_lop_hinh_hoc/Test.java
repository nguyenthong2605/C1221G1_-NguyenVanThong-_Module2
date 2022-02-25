package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resieable_cho_cac_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle(7, 5);
        Square square = new Square(8);

        Shape[] shapes = {circle, rectangle, square};
        for (Shape element : shapes) {
            System.out.println(element.getArea());
            if (element instanceof Square) {
                ((Square) element).howToColor();
            }
        }
    }
}
