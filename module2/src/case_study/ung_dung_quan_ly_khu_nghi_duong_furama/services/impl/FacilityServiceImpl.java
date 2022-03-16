package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.impl;

import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.Facility;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.House;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.Room;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.Villa;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void hienThi() {
        for (Map.Entry<Facility, Integer> facility : facilityIntegerMap.entrySet()) {
            System.out.println("Dịch vụ: " + facility.getKey() + " Số lần thuê: " + facility.getValue());
        }

    }

    @Override
    public void danhSachBaoTri() {

    }

    @Override
    public void themMoiVilla() {
        System.out.println("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê: ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa: ");
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi: ");
        double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng: ");
        int soTang = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        facilityIntegerMap.put(villa, 0);

    }

    @Override
    public void themMoiHouse() {
        System.out.println("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê: ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa: ");
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        int soTang = Integer.parseInt(scanner.nextLine());
        House house = new House(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        facilityIntegerMap.put(house, 0);
    }

    @Override
    public void themMoiRoom() {
        System.out.println("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê: ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa: ");
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí đi kèm: ");
        String dichVuMienPhiDiKem = scanner.nextLine();
        Room room = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhiDiKem);
        facilityIntegerMap.put(room, 0);
    }
}
