package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model;

public abstract class Person {
    private String hoVaTen;

    private String ngaySinh;

    private String gioiTinh;

    private String soCMND;

    private String soDienThoai;

    private String eMail;

    protected final String COMMA = ",";

    public Person() {
    }

    public Person(String hoVaTen, String ngaySinh, String gioiTinh, String soCMND, String soDienThoai, String eMail) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.eMail = eMail;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return
                "hoVaTen='" + hoVaTen + '\'' +
                        ", ngaySinh=" + ngaySinh +
                        ", gioiTinh='" + gioiTinh + '\'' +
                        ", soCMND=" + soCMND +
                        ", soDienThoai='" + soDienThoai + '\'' +
                        ", eMail='" + eMail + '\'';
    }

    public String getInfoToCSV() {
        return this.getHoVaTen() + COMMA +
                this.getNgaySinh() + COMMA +
                this.getGioiTinh() + COMMA +
                this.getSoCMND() + COMMA +
                this.getSoDienThoai() + COMMA +
                this.geteMail();
    }
}
