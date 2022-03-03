package oop_review.oop_java_2.bai2;

import oop_review.oop_java_2.bai2.quan_ly_sach.QuanLyBao;
import oop_review.oop_java_2.bai2.quan_ly_sach.QuanLySach;
import oop_review.oop_java_2.bai2.quan_ly_sach.QuanLyTapChi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        QuanLyBao quanLyBao = new QuanLyBao();
        QuanLyTapChi quanLyTapChi = new QuanLyTapChi();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("***** CHƯƠNG TRÌNH QUẢN LÍ TÀI LIỆU *****");
            System.out.println("1.Nhập thông tin mới cho tài liệu.");
            System.out.println("2.Hiển thị thông tin về các tài liệu.");
            System.out.println("3.Tìm kiếm tài liệu theo mã tài liệu.");
            System.out.println("4.Thoát");
            System.out.println("Nhập sự lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    int choice1 = -1;
                    Scanner scanner1 = new Scanner(System.in);
                    while (choice1 != 0) {
                        System.out.println("Người dùng chọn:");
                        System.out.println("1.Thêm sách.");
                        System.out.println("2.Thêm báo.");
                        System.out.println("3.Thêm tạp chí.");
                        choice1 = Integer.parseInt(scanner1.nextLine());
                        switch (choice1) {
                            case 1:
                                quanLySach.themMoi();
                                break;
                            case 2:
                                quanLyBao.themMoi();
                                break;
                            case 3:
                                quanLyTapChi.themMoi();
                                break;
                        }
                        break;
                    }
                    break;
                case 2:
                    quanLySach.hienThi();
                    quanLyBao.hienThi();
                    quanLyTapChi.hienThi();
                    break;
                case 3:
                    int choice2 = -1;
                    Scanner scanner2 = new Scanner(System.in);
                    while (choice2 != 0) {
                        System.out.println("Người dùng tìm kiếm loại gì:");
                        System.out.println("1.Tìm sách.");
                        System.out.println("2.Tìm báo.");
                        System.out.println("3.Tìm tạp chí.");
                        choice2 = Integer.parseInt(scanner2.nextLine());
                        switch (choice2) {
                            case 1:
                                quanLySach.timKiem();
                                break;
                            case 2:
                                quanLyBao.timKiem();
                                break;
                            case 3:
                                quanLyTapChi.timKiem();
                                break;
                        }
                        break;
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("Không có sự lựa chọn.");
            }
        }
    }
}
