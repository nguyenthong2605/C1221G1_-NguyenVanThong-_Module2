package oop_review.oop_java_2.bai2;

public class Bao extends ThuVien{
    private int ngayPhatHanh;

    public Bao() {
    }

    public Bao(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" + super.toString() +
                "ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
