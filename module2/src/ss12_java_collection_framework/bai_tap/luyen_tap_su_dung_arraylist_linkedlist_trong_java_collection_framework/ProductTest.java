package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("***** CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM *****");
            System.out.println("1.Thêm sản phẩm.");
            System.out.println("2.Sửa thông tin sản phẩm theo id.");
            System.out.println("3.Xóa sản phẩm theo id.");
            System.out.println("4.Hiển thị danh sách sản phẩm.");
            System.out.println("5.tìm kiếm sản phẩm theo tên.");
            System.out.println("6.Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("7.Sắp xếp tăng dần theo giá");
            System.out.println("8.Thoát");
            System.out.println("Nhập sự lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productManager.themMoi();
                    break;
                case 2:
                    productManager.sua();
                    break;
                case 3:
                    productManager.xoa();
                    break;
                case 4:
                    productManager.hienThi();
                    break;
                case 5:
                    productManager.timKiem();
                    break;
                case 6:
                    productManager.sapXepGiamDan();
                    break;
                case 7:
                    productManager.sapXepTangDan();
                    break;
                case 8:
                    System.exit(8);
                default:
                    System.out.println("Không có sự lựa chọn!");

            }
        }
    }
}
