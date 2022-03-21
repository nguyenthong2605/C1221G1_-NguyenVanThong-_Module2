package bai_lam_thu_11.models;

public class BenhNhanThuong extends BenhAn {
    private double phiNamVien;

    public BenhNhanThuong() {
    }

    public BenhNhanThuong(int soThuTuBenhAn, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDoNhapVien, double phiNamVien) {
        super(soThuTuBenhAn, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" + super.toString() +
                "phiNamVien=" + phiNamVien +
                '}';
    }
}
