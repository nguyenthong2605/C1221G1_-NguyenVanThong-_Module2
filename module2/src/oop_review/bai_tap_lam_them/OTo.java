package oop_review.bai_tap_lam_them;

public class OTo extends PhuongTienGiaoThong {
    private String kieuXe;
    private int soChoNgoi;

    public OTo() {
    }


    public OTo(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, String kieuXe, int soChoNgoi) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.kieuXe = kieuXe;
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public String toString() {
        return "OTo{" + super.toString()+
                "kieuXe=" + kieuXe +
                ", soChoNgoi='" + soChoNgoi + '\'' +
                '}';
    }
}
