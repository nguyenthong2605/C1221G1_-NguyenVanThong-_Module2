package bai_tap_lam_them_do_ghi_file.services;

import bai_tap_lam_them_do_ghi_file.models.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiServiceImpl implements XeTaiService {
    public static List<bai_tap_lam_them_do_ghi_file.models.XeTai> xeTaiList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi() {
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập trọng tải: ");
        double trongTai = Double.parseDouble(scanner.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        xeTaiList.add(xeTai);
    }

    @Override
    public void hienThi() {

    }

    @Override
    public void xoa() {

    }
}
