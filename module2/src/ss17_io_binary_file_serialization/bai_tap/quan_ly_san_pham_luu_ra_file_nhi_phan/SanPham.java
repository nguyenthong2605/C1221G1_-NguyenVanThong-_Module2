package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private String hanSanXuat;
    private double gia;
    private String cacMoTaKhac;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String hanSanXuat, double gia, String cacMoTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hanSanXuat = hanSanXuat;
        this.gia = gia;
        this.cacMoTaKhac = cacMoTaKhac;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHanSanXuat() {
        return hanSanXuat;
    }

    public void setHanSanXuat(String hanSanXuat) {
        this.hanSanXuat = hanSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getCacMoTaKhac() {
        return cacMoTaKhac;
    }

    public void setCacMoTaKhac(String cacMoTaKhac) {
        this.cacMoTaKhac = cacMoTaKhac;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hanSanXuat='" + hanSanXuat + '\'' +
                ", gia=" + gia +
                ", cacMoTaKhac='" + cacMoTaKhac + '\'' +
                '}';
    }
}
