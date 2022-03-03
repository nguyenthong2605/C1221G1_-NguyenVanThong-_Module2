package oop_review.oop_java_2.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCongNhan {
    private String hoVaTen;

    private int namSinh;

    private String gioiTinh;

    private String diaChi;

    private double bac;


    ArrayList<CongNhan> congNhanArrayList = new ArrayList<>();

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
        System.out.println("Nhập bậc: ");
        bac = Double.parseDouble(scanner.nextLine());
        CongNhan congNhan = new CongNhan(hoVaTen,namSinh,gioiTinh,diaChi,bac);
        congNhanArrayList.add(congNhan);
    }
    public void timKiem(){
        boolean check = false;
        System.out.println("Nhập họ và tên cần tìm kiếm: ");
        hoVaTen = scanner.nextLine();
        for (int i = 0; i <congNhanArrayList.size() ; i++) {
            if (congNhanArrayList.get(i).getHoVaTen().equals(hoVaTen));
            check = true;
            System.out.println("Người cần tìm: "+congNhanArrayList.get(i));
        }if (!check){
            System.out.println("Không tìm thấy.");
        }
    }
    public void sapXepTheoTen(){
        SapXepCongNhan sapXep = new SapXepCongNhan();
        congNhanArrayList.sort(sapXep);
        hienThi();
    }
    public void hienThi(){
        for (CongNhan congNhan:congNhanArrayList
             ) {
            System.out.println(congNhan);
        }
    }
}
