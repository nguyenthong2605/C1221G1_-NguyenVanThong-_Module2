package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.impl;

import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.Customer;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> customerLinkedList = new LinkedList<>();
    static {
        customerLinkedList.add(new Customer("châu bùi","1","nữ","112","0984384933","chaubui@gmail.com","a1233","Diamond","đà nẵng"));
        customerLinkedList.add(new Customer("phan an","3","nam","114","0123824422","phânn@gmail.com","g1221","Platinium","quảng nam"));
        customerLinkedList.add(new Customer("hoàng long","6","nam","110","0383829112","hoanglong@gmail.com","a9876","Gold","hà nội"));
    }
    Scanner scanner = new Scanner(System.in);

    String hoVaTen;

    String ngaySinh;

    String gioiTinh;

    String soCMND;

    String soDienThoai;

    String eMail;

    String maKhachHang;

    String loaiKhach;

    String diaChi;

    @Override
    public void disPlay() {
        for (Customer customer : customerLinkedList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập họ và tên: ");
        hoVaTen = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhập số CMND: ");
        soCMND = scanner.nextLine();
        System.out.println("Nhập số điện thoai: ");
        soDienThoai = scanner.nextLine();
        System.out.println("Nhập Email: ");
        eMail = scanner.nextLine();
        System.out.println("Nhập mã khách hàng: ");
        maKhachHang = scanner.nextLine();
        System.out.println("Nhập loại khách hàng");
        loaiKhach = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        customerLinkedList.add(new Customer(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, eMail, maKhachHang, loaiKhach, diaChi));


    }

    @Override
    public void edit() {
        System.out.println("Nhập mã khách hàng cần thay đổi: ");
        maKhachHang = scanner.nextLine();
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if (customerLinkedList.get(i).getMaKhachHang().equals(maKhachHang)) {
                System.out.println("Nhập họ và tên: ");
                hoVaTen = scanner.nextLine();
                if (hoVaTen.equals("")) {
                    customerLinkedList.get(i).setHoVaTen(customerLinkedList.get(i).getHoVaTen());
                } else {
                    customerLinkedList.get(i).setHoVaTen(hoVaTen);
                }
                System.out.println("Nhập ngày sinh:");
                ngaySinh = scanner.nextLine();
                if (ngaySinh.equals("")) {
                    customerLinkedList.get(i).setNgaySinh(customerLinkedList.get(i).getNgaySinh());
                } else {
                    customerLinkedList.get(i).setNgaySinh(ngaySinh);
                }
                System.out.println("Nhập giới tính: ");
                gioiTinh = scanner.nextLine();
                if (gioiTinh.equals("")) {
                    customerLinkedList.get(i).setGioiTinh(customerLinkedList.get(i).getGioiTinh());
                } else {
                    customerLinkedList.get(i).setGioiTinh(gioiTinh);
                }
                System.out.println("Nhập số CMND: ");
                soCMND = scanner.nextLine();
                if (soCMND.equals("")) {
                    customerLinkedList.get(i).setSoCMND(customerLinkedList.get(i).getSoCMND());
                } else {
                    customerLinkedList.get(i).setSoCMND(soCMND);
                }
                System.out.println("Nhập số điện thoai: ");
                soDienThoai = scanner.nextLine();
                if (soDienThoai.equals("")) {
                    customerLinkedList.get(i).setSoDienThoai(customerLinkedList.get(i).getSoDienThoai());
                } else {
                    customerLinkedList.get(i).setSoDienThoai(soDienThoai);
                }
                System.out.println("Nhập Email: ");
                eMail = scanner.nextLine();
                if (eMail.equals("")) {
                    customerLinkedList.get(i).seteMail(customerLinkedList.get(i).geteMail());
                } else {
                    customerLinkedList.get(i).seteMail(eMail);
                }
                System.out.println("Nhập mã khách hàng: ");
                maKhachHang = scanner.nextLine();
                if (maKhachHang.equals("")) {
                    customerLinkedList.get(i).setMaKhachHang(customerLinkedList.get(i).getMaKhachHang());
                } else {
                    customerLinkedList.get(i).setMaKhachHang(maKhachHang);
                }
                System.out.println("Nhập loại khách: ");
                loaiKhach = scanner.nextLine();
                if (loaiKhach.equals("")) {
                    customerLinkedList.get(i).setLoaiKhach(customerLinkedList.get(i).getLoaiKhach());
                } else {
                    customerLinkedList.get(i).setLoaiKhach(loaiKhach);
                }
                System.out.println("Nhập địa chỉ: ");
                diaChi = scanner.nextLine();
                if (diaChi.equals("")) {
                    customerLinkedList.get(i).setDiaChi(customerLinkedList.get(i).getDiaChi());
                } else {
                    customerLinkedList.get(i).setDiaChi(diaChi);
                }
            }

        }
    }
}