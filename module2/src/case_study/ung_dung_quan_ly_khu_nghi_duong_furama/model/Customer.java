package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model;

public class Customer extends Person{
    private String maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String hoVaTen, String ngaySinh, String gioiTinh, String soCMND, String soDienThoai, String eMail, String maKhachHang, String loaiKhach, String diaChi) {
        super(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, eMail);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "maKhachHang='" + maKhachHang + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
