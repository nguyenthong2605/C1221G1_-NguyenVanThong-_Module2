package oop_review.oop_java_2.bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLyCongNhan quanLyCongNhan = new QuanLyCongNhan();
        QuanLyKySu quanLyKySu = new QuanLyKySu();
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("***** CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM *****");
            System.out.println("1.Nhập thông tin mới cho cán bộ.");
            System.out.println("2.Tìm kiếm theo họ và tên.");
            System.out.println("3.Sắp xếp theo tên.");
            System.out.println("4.Hiển thị danh sách cán bộ");
            System.out.println("5.Thoát");
            System.out.println("Nhập sự lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choice1 = -1;
                    Scanner scanner1 = new Scanner(System.in);
                    while (choice1 != 0) {
                        System.out.println("Người dùng chọn:");
                        System.out.println("1.Thêm công nhân.");
                        System.out.println("2.Thêm kỹ sư.");
                        System.out.println("3.Thêm nhân viên.");
                        choice1 = Integer.parseInt(scanner1.nextLine());
                        switch (choice1) {
                            case 1:
                                quanLyCongNhan.themMoi();
                                break;
                            case 2:
                                quanLyKySu.themMoi();
                                break;
                            case 3:
                                quanLyNhanVien.themMoi();
                                break;
                        }
                        break;
                    }
                    break;
                case 2:
                    int choice2 = -1;
                    Scanner scanner2 = new Scanner(System.in);
                    while (choice2 != 0) {
                        System.out.println("Người dùng tìm kiếm ai:");
                        System.out.println("1.Tìm công nhân.");
                        System.out.println("2.Tìm kỹ sư.");
                        System.out.println("3.Tìm nhân viên.");
                        choice2 = Integer.parseInt(scanner2.nextLine());
                        switch (choice2) {
                            case 1:
                                quanLyCongNhan.timKiem();
                                break;
                            case 2:
                                quanLyKySu.timKiem();
                                break;
                            case 3:
                                quanLyNhanVien.timKiem();
                                break;
                        }
                        break;
                    }
                    break;
                case 3:
                    quanLyCongNhan.sapXepTheoTen();
                    quanLyKySu.sapXepTheoTen();
                    quanLyNhanVien.sapXepTheoTen();
                    break;
                case 4:
                    quanLyCongNhan.hienThi();
                    quanLyKySu.hienThi();
                    quanLyNhanVien.hienThi();
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("Không có sự lựa chọn!");

            }
        }

    }
}
