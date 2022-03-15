package bai_tap_lam_them_do_ghi_file.services;

import bai_tap_lam_them_do_ghi_file.models.XeMay;
import oop_review.bai_tap_lam_them.OTo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayServiceImpl implements XeMayService{
    public static List<bai_tap_lam_them_do_ghi_file.models.XeMay> xeMayList = new ArrayList<>();
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
        System.out.println("Nhập công suất: ");
        double congSuat = Double.parseDouble(scanner.nextLine());
        XeMay xeMay = new XeMay(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,congSuat);
        xeMayList.add(xeMay);

    }

    @Override
    public void hienThi() {

    }

    @Override
    public void xoa() {

    }
}
