package oop_review.oop_java_2.bai2.quan_ly_sach;

import oop_review.oop_java_2.bai2.Sach;
import oop_review.oop_java_2.bai2.TapChi;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTapChi {
    private int maTaiLieu;

    private String tenNhaXuatBan;

    private int soBanPhatHanh;

    private int soPhatHanh;

    private int thangPhatHanh;

    ArrayList<TapChi> tapChiArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void themMoi() {
        System.out.println("Nhập mã tài liệu:");
        maTaiLieu = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà xuất bản: ");
        tenNhaXuatBan = scanner.nextLine();
        System.out.println("Nhập số bản phát hành:");
        soBanPhatHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số phát hành: ");
        soPhatHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số trang: ");
        thangPhatHanh = Integer.parseInt(scanner.nextLine());
        TapChi tapChi = new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
        tapChiArrayList.add(tapChi);
    }

    public void hienThi() {
        for (TapChi tapChi : tapChiArrayList
        ) {
            System.out.println(tapChi);
        }
    }

    public void timKiem() {
        boolean flag = false;
        System.out.println("Nhập mã tài liệu cần tìm: ");
        maTaiLieu = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tapChiArrayList.size(); i++) {
            if (tapChiArrayList.get(i).getMaTaiLieu() == maTaiLieu) {
                flag = true;
                System.out.println("Tạp chí cần tìm là: " + tapChiArrayList.get(i));
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy.");
        }

    }

}
