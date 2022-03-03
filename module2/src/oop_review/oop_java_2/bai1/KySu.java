package oop_review.oop_java_2.bai1;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String hoVaTen, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoVaTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" + super.toString() +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
