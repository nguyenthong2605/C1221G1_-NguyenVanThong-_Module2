package bai_lam_thu_11.models;

public class BenhNhanVip extends BenhAn {
    private String loaiVip;

    private String thoiHanVip;

    public BenhNhanVip() {
    }

    public BenhNhanVip(int soThuTuBenhAn, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDoNhapVien) {
        super(soThuTuBenhAn, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhNhanVip{" + super.toString() +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                '}';
    }
}
