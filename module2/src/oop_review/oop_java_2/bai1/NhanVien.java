package oop_review.oop_java_2.bai1;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String hoVaTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
        super(hoVaTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString() +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
