package bai_tap_lam_them_do_ghi_file.services;

import bai_tap_lam_them_do_ghi_file.models.OTo;
import oop_review.bai_tap_lam_them.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OToServiceImpl implements OToService {
    public static List<bai_tap_lam_them_do_ghi_file.models.OTo> oToList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi() {
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập kiểu xe: ");
        String kieuXe = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        OTo oTo = new OTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, kieuXe, soChoNgoi);
        oToList.add(oTo);
    }

    @Override
    public void hienThi() {

    }

    @Override
    public void xoa() {

    }
}
