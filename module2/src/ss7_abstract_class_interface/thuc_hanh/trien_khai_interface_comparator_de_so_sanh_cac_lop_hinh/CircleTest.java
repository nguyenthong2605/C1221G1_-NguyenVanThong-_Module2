package ss7_abstract_class_interface.thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
