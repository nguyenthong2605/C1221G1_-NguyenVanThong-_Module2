package oop_review.nhap_xuat_thong_tin_xe;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[50];
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin.");
            System.out.println("2.Xuất bản kê khai tiền thuế của xe.");
            System.out.println("3.Thoát.");
            System.out.println("Nhập sự lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int count = 0;
                    System.out.println("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    count = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < count; i++) {
                        if (vehicles[i] == null) {
                            System.out.println("Xe thứ " + (i + 1));
                            System.out.println("Nhập trị giá xe: ");
                            double triGia = Double.parseDouble(scanner.nextLine());
                            System.out.println("Nhập dung tích xi lanh: ");
                            int dungTich = Integer.parseInt(scanner.nextLine());
                            vehicles[i] = new Vehicle(triGia, dungTich);
                        }
                    }

                    break;
                case 2:
                    System.out.println("In thuế");
                    for (int i = 0; i < vehicles.length; i++) {
                        if (vehicles[i] != null) {
                            System.out.println("Thuế xe" + (i + 1) + " là" + vehicles[i].tinhThue());
                        }
                    }
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Không có lựa chọn!");
            }
        }
    }
}
