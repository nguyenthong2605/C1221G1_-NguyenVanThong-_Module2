package oop_review.oop_java_2.bai1;

public class CongNhan extends CanBo{
    private double bac;

    public CongNhan() {
    }

    public CongNhan(String hoVaTen, int namSinh, String gioiTinh, String diaChi, double bac) {
        super(hoVaTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public double getBac() {
        return bac;
    }

    public void setBac(double bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" + super.toString() +
                "bac=" + bac +
                '}';
    }
}
