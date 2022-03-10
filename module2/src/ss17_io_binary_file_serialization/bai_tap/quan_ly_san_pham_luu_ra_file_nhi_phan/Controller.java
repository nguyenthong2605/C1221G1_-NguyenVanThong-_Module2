package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.Scanner;

public class Controller {
    public void menu() {
        SanPhamImpl sanPham = new SanPhamImpl();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Quản lý sản phẩm.");
            System.out.println("1. Thêm");
            System.out.println("2. Hiển thị");
            System.out.println("3. Tìm kiếm thông tin sản phẩm vào file");
            System.out.println("4. Thoát");
            System.out.println("Mời bạn chọn.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    sanPham.them();
                    break;
                case 2:
                    sanPham.hienThi();
                    break;
                case 3:
                    sanPham.timKiem();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Không có sự lựa chọn! ");
            }
        }
    }
}

