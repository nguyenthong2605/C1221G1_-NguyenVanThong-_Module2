package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model;

public class Employee extends Person {
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private String luong;

    public Employee() {
    }

    public Employee(String hoVaTen, String ngaySinh, String gioiTinh, String soCMND, String soDienThoai, String eMail, String maNhanVien, String trinhDo, String viTri, String luong) {
        super(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, eMail);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", maNhanVien='" + maNhanVien + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
    public String getInfoToCSV(){
        return super.getInfoToCSV()+COMMA+
                this.getMaNhanVien()+COMMA+
                this.getTrinhDo()+COMMA+
                this.getViTri()+COMMA+
                this.getLuong();
    }
}
