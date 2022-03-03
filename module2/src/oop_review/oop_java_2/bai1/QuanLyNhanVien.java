package oop_review.oop_java_2.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    private String hoVaTen;

    private int namSinh;

    private String gioiTinh;

    private String diaChi;

    private String congViec;


    ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();

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
        System.out.println("Công việc: ");
        congViec = scanner.nextLine();
        NhanVien nhanVien = new NhanVien(hoVaTen,namSinh,gioiTinh,diaChi,congViec);
        nhanVienArrayList.add(nhanVien);
    }
    public void timKiem(){
        boolean check = false;
        System.out.println("Nhập họ và tên cần tìm kiếm: ");
        hoVaTen = scanner.nextLine();
        for (int i = 0; i <nhanVienArrayList.size() ; i++) {
            if (nhanVienArrayList.get(i).getHoVaTen().equals(hoVaTen));
            check = true;
            System.out.println("Người cần tìm: "+nhanVienArrayList.get(i));
        }if (!check){
            System.out.println("Không tìm thấy.");
        }
    }
    public void sapXepTheoTen(){
        SapXepNhanVien sapXep = new SapXepNhanVien();
        nhanVienArrayList.sort(sapXep);
        hienThi();
    }
    public void hienThi(){
        for (NhanVien nhanVien:nhanVienArrayList
        ) {
            System.out.println(nhanVien);
        }
    }
}
