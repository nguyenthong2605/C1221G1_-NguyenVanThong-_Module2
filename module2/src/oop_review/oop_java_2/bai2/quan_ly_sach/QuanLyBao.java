package oop_review.oop_java_2.bai2.quan_ly_sach;

import oop_review.oop_java_2.bai2.Bao;
import oop_review.oop_java_2.bai2.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyBao {
    private int maTaiLieu;

    private String tenNhaXuatBan;

    private int soBanPhatHanh;

    private int ngayPhatHanh;

    ArrayList<Bao> baoArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void themMoi() {
        System.out.println("Nhập mã tài liệu:");
        maTaiLieu = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà xuất bản: ");
        tenNhaXuatBan = scanner.nextLine();
        System.out.println("Nhập số bản phát hành:");
        soBanPhatHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày phát hành: ");
        ngayPhatHanh = Integer.parseInt(scanner.nextLine());
        Bao bao = new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
        baoArrayList.add(bao);
    }

    public void hienThi() {
        for (Bao bao : baoArrayList
        ) {
            System.out.println(bao);
        }
    }

    public void timKiem() {
        boolean flag = false;
        System.out.println("Nhập mã tài liệu cần tìm: ");
        maTaiLieu = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < baoArrayList.size(); i++) {
            if (baoArrayList.get(i).getMaTaiLieu() == maTaiLieu) {
                flag = true;
                System.out.println("Báo cần tìm là: " + baoArrayList.get(i));
            }
        }if (!flag) {
            System.out.println("Không tìm thấy.");
        }
    }
}
