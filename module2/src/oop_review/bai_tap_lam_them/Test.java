package oop_review.bai_tap_lam_them;


import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<XeTai> listXeTai = new ArrayList<>();
        ArrayList<OTo> listOTo = new ArrayList<>();
        ArrayList<XeMay> listXeMay = new ArrayList<>();
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
                        System.out.println("2.Thêm ôtô.");
                        System.out.println("3.Thêm xe máy.");
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
                                listXeTai.add(xeTai);
                                System.out.println(xeTai);
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
                                listOTo.add(oTo);
                                System.out.println(oTo);
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
                                listXeMay.add(xeMay);
                                System.out.println(xeMay);
                                break;
                            default:
                                break;
                        }
                        break;
                    }
                    break;
                case 2:
                    int choice2 = -1;
                    Scanner scanner2 = new Scanner(System.in);
                    while (choice2 != 0) {
                        System.out.println("Người dùng muốn hiện gì:");
                        System.out.println("1.Hiển thị xe tải.");
                        System.out.println("2.Hiển thị xe ôtô.");
                        System.out.println("3.Hiển thị xe máy xe máy.");
                        choice2 = Integer.parseInt(scanner2.nextLine());
                        switch (choice2) {
                            case 1:
                                for (XeTai xe : listXeTai) {
                                    System.out.println(xe);
                                }
                                break;
                            case 2:
                                for (OTo oto : listOTo) {
                                    System.out.println(oto);
                                }
                                break;
                            case 3:
                                for (XeMay xemay : listXeMay) {
                                    System.out.println(xemay);
                                }
                            default:
                                break;
                        }
                        break;
                    }
                    break;
                case 3:

                    System.out.println("Nhập biển kiểm soát");
                    String bienKiemSoatCanXoa = scanner.nextLine();
                    for (int i = 0; i < listXeTai.size(); i++) {
                        if (listXeTai.get(i).getBienKiemSoat().equals(bienKiemSoatCanXoa)) {
                            System.out.println("Bạn có chắc chắn xóa không(nhập yes hoặc no)");
                            String chonKetQua = scanner.nextLine();
                            if (chonKetQua.equals("yes")) {
                                listXeTai.remove(i);
                                System.out.println("Đã xóa thành công.");
                            } else if (chonKetQua.equals("no")) {
                                break;
                            }
                        }

                    }
                    for (int i = 0; i < listOTo.size(); i++) {
                        if (listOTo.get(i).getBienKiemSoat().equals(bienKiemSoatCanXoa)) {
                            System.out.println("Bạn có chắc chắn xóa không(nhập yes hoặc no)");
                            String chonKetQua = scanner.nextLine();
                            if (chonKetQua.equals("yes")) {
                                listOTo.remove(i);
                                System.out.println("Đã xóa thành công.");
                            } else if (chonKetQua.equals("no")) {
                                break;
                            }
                        }

                    }
                    for (int i = 0; i < listXeMay.size(); i++) {
                        if (listXeMay.get(i).getBienKiemSoat().equals(bienKiemSoatCanXoa)) {
                            System.out.println("Bạn có chắc chắn xóa không(nhập yes hoặc no)");
                            String chonKetQua = scanner.nextLine();
                            if (chonKetQua.equals("yes")) {
                                listXeMay.remove(i);
                                System.out.println("Đã xóa thành công.");
                            } else if (chonKetQua.equals("no")) {
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Không có sự lựa chọn");

            }
        }
    }

}