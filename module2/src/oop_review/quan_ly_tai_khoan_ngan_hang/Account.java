package oop_review.quan_ly_tai_khoan_ngan_hang;

import java.util.Scanner;

public class Account {
    private long soTaiKhoan;

    private String tenTaiKhoan;

    private double soTienTrongTaiKhoan;

    private double laiSuat = 0.035;

    public Account() {
    }

    public Account(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public Account(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = 50;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "Account{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                '}';
    }

    public double napTien() {
        double tienNapVao;
        do {
            System.out.println("Nhập số tiền bạn cần nạp: ");
            Scanner input = new Scanner(System.in);
            tienNapVao = Double.parseDouble(input.nextLine());
        }while (tienNapVao < 0); {
           return this.soTienTrongTaiKhoan = this.soTienTrongTaiKhoan + tienNapVao;
        }
    }
    public double rutTien() {
        double tienRutRa;
        double phiRutTien = 0.03;
        do {
            System.out.println("Nhập số tiền bận cần rut: ");
            Scanner output = new Scanner(System.in);
            tienRutRa = Double.parseDouble(output.nextLine());
        }while (tienRutRa > this.soTienTrongTaiKhoan);{
            return this.soTienTrongTaiKhoan = this.soTienTrongTaiKhoan - (tienRutRa + phiRutTien);
        }
    }
    public double daoHan(){
        return this.soTienTrongTaiKhoan = this.soTienTrongTaiKhoan + this.soTienTrongTaiKhoan * laiSuat;
    }
    public double chuyenTien(Account account ){
        double soTienChuyen;
        System.out.println("Nhập số tiền cần chuyển: ");
        Scanner input = new Scanner(System.in);
        soTienChuyen = Double.parseDouble(input.nextLine());
        System.out.println("Số tài khoản cần chuyển: ");
        Scanner scanner = new Scanner(System.in);
        this.soTaiKhoan = Long.parseLong(scanner.nextLine());
        return account.soTienTrongTaiKhoan = account.soTienTrongTaiKhoan + soTienChuyen;
    }
}
