package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.impl;

import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.Employee;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.EmployeeService;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static List<Employee> employeeArrayList = new ArrayList<>();

    static {
        employeeArrayList.add(new Employee("nguyễn văn thông", "26", "nam", "123456", "0338592181", "nguyenthong2652000@gmail.com", "123", "đại học", "giám đốc", "3000"));
        employeeArrayList.add(new Employee("huỳnh thị út quyên", "7", "nữ", "654321", "0367692847", "utquyen71000@gmail.com", "456", "cao đẳng", "lễ tân", "1000"));
    }

    static {
        employeeArrayList = ReadAndWrite.readEmployeeListFromCSV();
    }

    private String hoVaTen;

    private String ngaySinh;

    private String gioiTinh;

    private String soCMND;

    private String soDienThoai;

    private String eMail;

    private String maNhanVien;

    private String trinhDo;

    private String viTri;

    private String luong;


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
        ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhập số CMND: ");
        soCMND = scanner.nextLine();
        System.out.println("Nhập số điện thoai: ");
        soDienThoai = scanner.nextLine();
        System.out.println("Nhập Email: ");
        eMail = scanner.nextLine();
        System.out.println("Nhập mã nhân viên: ");
        maNhanVien = scanner.nextLine();
        System.out.println("Nhập trình độ: ");
        trinhDo = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        viTri = scanner.nextLine();
        System.out.println("Nhập lương: ");
        luong = scanner.nextLine();
        Employee employee = new Employee(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, eMail, maNhanVien, trinhDo, viTri, luong);
        employeeArrayList.add(employee);
        ReadAndWrite.writeEmployeeListFromCSV(employeeArrayList,false);
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã nhân viên cần sửa đổi thông tin: ");
        maNhanVien = scanner.nextLine();
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getMaNhanVien().equals(maNhanVien)) {
                System.out.println("Nhập họ và tên:");
                hoVaTen = scanner.nextLine();
                if (hoVaTen.equals("")) {
                    employeeArrayList.get(i).setHoVaTen(employeeArrayList.get(i).getHoVaTen());
                } else {
                    employeeArrayList.get(i).setHoVaTen(hoVaTen);
                }
                System.out.println("Nhập ngày sinh:");
                ngaySinh = scanner.nextLine();
                if (ngaySinh.equals("")) {
                    employeeArrayList.get(i).setNgaySinh(employeeArrayList.get(i).getNgaySinh());
                } else {
                    employeeArrayList.get(i).setNgaySinh(ngaySinh);
                }
                System.out.println("Nhập giới tính: ");
                gioiTinh = scanner.nextLine();
                if (gioiTinh.equals("")) {
                    employeeArrayList.get(i).setGioiTinh(employeeArrayList.get(i).getGioiTinh());
                } else {
                    employeeArrayList.get(i).setGioiTinh(gioiTinh);
                }
                System.out.println("Nhập số CMND: ");
                soCMND = scanner.nextLine();
                if (soCMND.equals("")) {
                    employeeArrayList.get(i).setSoCMND(employeeArrayList.get(i).getSoCMND());
                } else {
                    employeeArrayList.get(i).setSoCMND(soCMND);
                }
                System.out.println("Nhập số điện thoai: ");
                soDienThoai = scanner.nextLine();
                if (soDienThoai.equals("")) {
                    employeeArrayList.get(i).setSoDienThoai(employeeArrayList.get(i).getSoDienThoai());
                } else {
                    employeeArrayList.get(i).setSoDienThoai(soDienThoai);
                }
                System.out.println("Nhập Email: ");
                eMail = scanner.nextLine();
                if (eMail.equals("")) {
                    employeeArrayList.get(i).seteMail(employeeArrayList.get(i).geteMail());
                } else {
                    employeeArrayList.get(i).seteMail(eMail);
                }
                System.out.println("Nhập trình độ: ");
                trinhDo = scanner.nextLine();
                if (trinhDo.equals("")) {
                    employeeArrayList.get(i).setTrinhDo(employeeArrayList.get(i).getTrinhDo());
                } else {
                    employeeArrayList.get(i).setTrinhDo(trinhDo);
                }
                System.out.println("Nhập vị trí: ");
                viTri = scanner.nextLine();
                if (viTri.equals("")) {
                    employeeArrayList.get(i).setViTri(employeeArrayList.get(i).getViTri());
                } else {
                    employeeArrayList.get(i).setViTri(viTri);
                }
                System.out.println("Nhập lương: ");
                String luong = scanner.nextLine();
                if (luong.equals("")) {
                    employeeArrayList.get(i).setLuong(employeeArrayList.get(i).getLuong());
                } else {
                    employeeArrayList.get(i).setLuong(luong);
                }
                ReadAndWrite.writeEmployeeListFromCSV(employeeArrayList,false);
            }
        }
    }


}
