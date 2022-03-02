package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework;

import org.jetbrains.annotations.NotNull;

public class Product{
    private String tenSanPham;
    private int id;
    private double gia;

    public Product() {
    }

    public Product(String tenSanPham, int id, double gia) {
        this.tenSanPham = tenSanPham;
        this.id = id;
        this.gia = gia;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", id=" + id +
                ", gia=" + gia +
                '}';
    }

}
