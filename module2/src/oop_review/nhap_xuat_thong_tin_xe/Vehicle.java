package oop_review.nhap_xuat_thong_tin_xe;

public class Vehicle {
    private double triGia;

    private int dungTich;

    public Vehicle() {
    }

    public Vehicle(double triGia, int dungTich) {
        this.triGia = triGia;
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double tinhThue() {
        double mucThue;
        if (dungTich > 200) {
            mucThue = triGia * 0.05;
        } else if (dungTich >= 100) {
            mucThue = triGia * 0.03;
        } else {
            mucThue = triGia * 0.01;
        }
        return mucThue;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "triGia=" + triGia +
                ", dungTich=" + dungTich +
                '}';
    }

}
