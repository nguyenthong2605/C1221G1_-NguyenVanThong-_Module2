package bai_tap_lam_them_do_ghi_file.controllers;

import java.util.Scanner;

public class PhuongTienController {
    public void menu() {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choice1 = -1;
                    Scanner scanner1 = new Scanner(System.in);
                    while (choice1 != 0) {
                        System.out.println("Người dùng chọn:");
                        System.out.println("1.Thêm xe tải.");
                        System.out.println("2.Thêm ôtô.");
                        System.out.println("3.Thêm xe máy.");
                        choice1 = Integer.parseInt(scanner1.nextLine());
                        switch (choice1){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Không có sự lựa chọn");
            }
        }
    }
}
