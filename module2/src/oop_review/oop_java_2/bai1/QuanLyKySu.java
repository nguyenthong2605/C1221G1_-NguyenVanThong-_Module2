package oop_review.oop_java_2.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKySu {
    private String hoVaTen;

    private int namSinh;

    private String gioiTinh;

    private String diaChi;

    private String nganhDaoTao;

    ArrayList<KySu> kySuArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void themMoi() {
        System.out.println("Nhập tên: ");
        hoVaTen = scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.println("Ngành đào tạo: ");
        nganhDaoTao = scanner.nextLine();
        KySu kySu = new KySu(hoVaTen,namSinh,gioiTinh,diaChi,nganhDaoTao);
        kySuArrayList.add(kySu);
    }
    public void timKiem(){
        boolean check = false;
        System.out.println("Nhập họ và tên cần tìm kiếm: ");
        hoVaTen = scanner.nextLine();
        for (int i = 0; i <kySuArrayList.size() ; i++) {
            if (kySuArrayList.get(i).getHoVaTen().equals(hoVaTen));
            check = true;
            System.out.println("Người cần tìm: "+kySuArrayList.get(i));
        }if (!check){
            System.out.println("Không tìm thấy.");
        }
    }
    public void sapXepTheoTen(){
        SapXepKySu sapXep = new SapXepKySu();
        kySuArrayList.sort(sapXep);
        hienThi();
    }
    public void hienThi(){
        for (KySu kySu:kySuArrayList
        ) {
            System.out.println(kySu);
        }
    }
}
