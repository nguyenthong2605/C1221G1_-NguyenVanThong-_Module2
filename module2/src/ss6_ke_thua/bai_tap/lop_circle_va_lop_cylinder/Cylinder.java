package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height = 5.0;
    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * this.height;
    }
    
    @Override
    public String toString() {
        return "Cylinder{" +
                "area="+ super.getArea()+","+
                "height=" + height +","+
                "volume="+getVolume()+
                '}';
    }
}
