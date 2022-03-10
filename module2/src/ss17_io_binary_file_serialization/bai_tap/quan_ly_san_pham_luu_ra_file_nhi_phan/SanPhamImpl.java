package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPhamImpl {
    ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
    DocVaGhi docVaGhi = new DocVaGhi();
    Scanner scanner = new Scanner(System.in);

    public void them() {
        System.out.println("Nhập mã sản phẩm: ");
        String maSanPham = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String tenSanPham = scanner.nextLine();
        System.out.println("Nhập hãn sản xuất: ");
        String hanSanXuat = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double gia = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập các mô tả khác: ");
        String cacMoTaKhac = scanner.nextLine();
        SanPham sanPham = new SanPham(maSanPham, tenSanPham, hanSanXuat, gia, cacMoTaKhac);
        sanPhamArrayList.add(sanPham);
        docVaGhi.ghiFileSanPham(sanPhamArrayList);
    }

    public void hienThi() {
        for (SanPham sanpham : sanPhamArrayList) {
            System.out.println(sanpham);

        }
    }

    public void timKiem() {
        boolean check = false;
        System.out.println("Nhập mã sản phẩm cần tìm: ");
        String maSanPham = scanner.nextLine();
        for (int i = 0; i < sanPhamArrayList.size(); i++) {
            if (sanPhamArrayList.get(i).getMaSanPham().contains(maSanPham)) {
                check = true;
                System.out.println(sanPhamArrayList.get(i));
            }
            if (!check) {
                System.out.println("Không tìm thấy!");
            }

        }
    }
}
