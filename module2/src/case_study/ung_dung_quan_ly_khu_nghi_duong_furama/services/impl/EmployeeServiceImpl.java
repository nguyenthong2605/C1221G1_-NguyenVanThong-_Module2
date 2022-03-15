package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.impl;

import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.Employee;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private String hoVaTen;

    private int ngaySinh;

    private String gioiTinh;

    private int soCMND;

    private String soDienThoai;

    private String eMail;

    private int maNhanVien;

    private String trinhDo;

    private String viTri;

    private double luong;

    public static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void disPlay() {
        for (Employee employee : employeeArrayList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập họ và tên: ");
        hoVaTen = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        ngaySinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhập số CMND: ");
        soCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoai: ");
        soDienThoai = scanner.nextLine();
        System.out.println("Nhập Email: ");
        eMail = scanner.nextLine();
        System.out.println("Nhập mã nhân viên: ");
        maNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trình độ: ");
        trinhDo = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        viTri = scanner.nextLine();
        System.out.println("Nhập lương: ");
        luong = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, eMail, maNhanVien, trinhDo, viTri, luong);
        employeeArrayList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã nhân viên cần sửa đổi thông tin: ");
        maNhanVien = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getMaNhanVien() == maNhanVien) {
                System.out.println("Nhập họ và tên:");
                hoVaTen = scanner.nextLine();
                employeeArrayList.get(i).setHoVaTen(hoVaTen);
                System.out.println("Nhập ngày sinh:");
                ngaySinh = Integer.parseInt(scanner.nextLine());
                employeeArrayList.get(i).setNgaySinh(ngaySinh);
                System.out.println("Nhập giới tính: ");
                gioiTinh = scanner.nextLine();
                employeeArrayList.get(i).setGioiTinh(gioiTinh);
                System.out.println("Nhập số CMND: ");
                soCMND = Integer.parseInt(scanner.nextLine());
                employeeArrayList.get(i).setSoCMND(soCMND);
                System.out.println("Nhập số điện thoai: ");
                soDienThoai = scanner.nextLine();
                employeeArrayList.get(i).setSoDienThoai(soDienThoai);
                System.out.println("Nhập Email: ");
                eMail = scanner.nextLine();
                employeeArrayList.get(i).seteMail(eMail);
                System.out.println("Nhập trình độ: ");
                trinhDo = scanner.nextLine();
                employeeArrayList.get(i).setTrinhDo(trinhDo);
                System.out.println("Nhập vị trí: ");
                viTri = scanner.nextLine();
                employeeArrayList.get(i).setViTri(viTri);
                System.out.println("Nhập lương: ");
                luong = Double.parseDouble(scanner.nextLine());
                employeeArrayList.get(i).setLuong(luong);
            }
        }
    }
}
