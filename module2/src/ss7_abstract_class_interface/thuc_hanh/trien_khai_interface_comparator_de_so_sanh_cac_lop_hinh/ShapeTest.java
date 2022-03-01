package ss7_abstract_class_interface.thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}