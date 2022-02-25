package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resieable_cho_cac_lop_hinh_hoc;

public class Square extends Rectangle implements Colorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }


    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                ;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}


