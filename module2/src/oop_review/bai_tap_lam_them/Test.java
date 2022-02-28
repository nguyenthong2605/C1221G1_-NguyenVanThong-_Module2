package oop_review.bai_tap_lam_them;


import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<PhuongTienGiaoThong> list = new ArrayList<>();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng:");
            System.out.println("1.Thêm mới phương tiện.");
            System.out.println("2.Hiện thị phương tiện.");
            System.out.println("3.Xóa phương tiện.");
            System.out.println("4.Thoát.");
            System.out.println("Nhập sự lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choice1 = -1;
                    Scanner scanner1 = new Scanner(System.in);
                    while (choice1 != 0) {
                        System.out.println("Người dùng chọn:");
                        System.out.println("1.Thêm xe tải.");
                        System.out.println("1.Thêm ôtô.");
                        System.out.println("1.Thêm xe máy.");
                        choice1 = Integer.parseInt(scanner1.nextLine());
                        String bienKiemSoat, hangSanXuat, chuSoHuu, kieuXe;
                        int namSanXuat, soChoNgoi;
                        double trongTai, congSuat;
                        switch (choice1) {
                            case 1:
                                System.out.println("Nhập biển kiểm soát: ");
                                bienKiemSoat = scanner.nextLine();
                                System.out.println("Nhập hãng sản xuất: ");
                                hangSanXuat = scanner.nextLine();
                                System.out.println("Nhập năm sản xuất: ");
                                namSanXuat = Integer.parseInt(scanner.nextLine());
                                System.out.println("Nhập chủ sở hữu: ");
                                chuSoHuu = scanner.nextLine();
                                System.out.println("Nhập trọng tải: ");
                                trongTai = Double.parseDouble(scanner.nextLine());
                                XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
                                list.add(xeTai);
                                break;
                            case 2:
                                System.out.println("Nhập biển kiểm soát:");
                                bienKiemSoat = scanner.nextLine();
                                System.out.println("Nhập hãng sản xuất: ");
                                hangSanXuat = scanner.nextLine();
                                System.out.println("Nhập năm sản xuất: ");
                                namSanXuat = Integer.parseInt(scanner.nextLine());
                                System.out.println("Nhập chủ sở hữu: ");
                                chuSoHuu = scanner.nextLine();
                                System.out.println("Nhập kiểu xe: ");
                                kieuXe = scanner.nextLine();
                                System.out.println("Nhập số chỗ ngồi: ");
                                soChoNgoi = Integer.parseInt(scanner.nextLine());
                                OTo oTo = new OTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, kieuXe, soChoNgoi);
                                break;
                            case 3:
                                System.out.println("Nhập biển kiểm soát:");
                                bienKiemSoat = scanner.nextLine();
                                System.out.println("Nhập hãng sản xuất: ");
                                hangSanXuat = scanner.nextLine();
                                System.out.println("Nhập năm sản xuất: ");
                                namSanXuat = Integer.parseInt(scanner.nextLine());
                                System.out.println("Nhập chủ sở hữu: ");
                                chuSoHuu = scanner.nextLine();
                                System.out.println("Nhập công suất: ");
                                congSuat = Double.parseDouble(scanner.nextLine());
                                XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
                                break;

                        }
                    }
            }
        }
    }
}
