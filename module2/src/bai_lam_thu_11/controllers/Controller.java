package bai_lam_thu_11.controllers;

import java.util.Scanner;

public class Controller {
    public void menu() {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN--");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các bệnh án");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, hãy nhập lại!");
            }
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("Hãy chọn lại.");
            }
        }
    }
}
