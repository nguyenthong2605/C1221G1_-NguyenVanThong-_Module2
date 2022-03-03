package oop_review.oop_java_2.bai2.quan_ly_sach;

import oop_review.oop_java_2.bai2.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private int maTaiLieu;

    private String tenNhaXuatBan;

    private int soBanPhatHanh;

    private String tenTacGia;

    private int soTrang;

    ArrayList<Sach> sachArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void themMoi() {
        System.out.println("Nhập mã tài liệu:");
        maTaiLieu = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà xuất bản: ");
        tenNhaXuatBan = scanner.nextLine();
        System.out.println("Nhập số bản phát hành:");
        soBanPhatHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tác giả: ");
        tenTacGia = scanner.nextLine();
        System.out.println("Nhập số trang: ");
        soTrang = Integer.parseInt(scanner.nextLine());
        Sach sach = new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
        sachArrayList.add(sach);
    }
    public void hienThi(){
        for (Sach sach:sachArrayList
             ) {
            System.out.println(sach);
        }
    }
    public void timKiem(){
        boolean flag = false;
        System.out.println("Nhập mã tài liệu cần tìm: ");
        maTaiLieu = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <sachArrayList.size() ; i++) {
            if (sachArrayList.get(i).getMaTaiLieu() == maTaiLieu){
                flag = true;
                System.out.println("Sách cần tìm là: "+sachArrayList.get(i));
            }
        }if (!flag){
            System.out.println("Không tìm thấy.");
        }

    }
}
