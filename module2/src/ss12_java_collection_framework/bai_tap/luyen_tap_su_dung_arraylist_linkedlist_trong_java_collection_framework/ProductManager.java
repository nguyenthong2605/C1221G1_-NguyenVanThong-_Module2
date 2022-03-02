package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private String tenSanPham;

    private int id;

    private double giaSanPham;

    ArrayList<Product> productArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void themMoi() {
        System.out.println("Nhập tên sản phẩm: ");
        tenSanPham = scanner.nextLine();
        System.out.println("Nhập id: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        giaSanPham = Double.parseDouble(scanner.nextLine());
        Product product = new Product(tenSanPham, id, giaSanPham);
        productArrayList.add(product);
    }

    public void sua() {
        System.out.println("Nhập id sản phẩm cần sửa: ");
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                System.out.println("Nhập tên sản phẩm: ");
                tenSanPham = scanner.nextLine();
                productArrayList.get(i).setTenSanPham(tenSanPham);
                System.out.println("Nhập giá sản phẩm: ");
                giaSanPham = Double.parseDouble(scanner.nextLine());
                productArrayList.get(i).setGia(giaSanPham);
            }else {
                break;
            }
        }
    }

    public void xoa() {
        System.out.println("Nhập id sản phẩm cần xóa: ");
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.remove(i);
            } else {
                break;
            }
        }
    }

    public void hienThi() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }
    }
    public void timKiem(){
        boolean check = false;
        System.out.println("Nhập tên sản phẩm cần tìm kiếm: ");
        tenSanPham = scanner.nextLine();
        for (int i = 0; i <productArrayList.size() ; i++) {
            if (productArrayList.get(i).getTenSanPham().equals(tenSanPham)){
                check = true;
                System.out.println("Sản phẩm cần tìm kiếm là: "+productArrayList.get(i));
            }
        }if (!check){
            System.out.println("Không tìm thấy.");
        }
    }
    public void sapXepGiamDan(){
        GiamDan giamDan = new GiamDan();
        productArrayList.sort(giamDan);
        hienThi();
    }
    public void sapXepTangDan(){
        TangDan tangDan = new TangDan();
        productArrayList.sort(tangDan);
        hienThi();
    }

//    @Override
//    public String toString() {
//        return "ProductManager{" +
//                "tenSanPham='" + tenSanPham + '\'' +
//                ", id=" + id +
//                ", giaSanPham=" + giaSanPham +
//                ", productArrayList=" + productArrayList +
//                ", scanner=" + scanner +
//                '}';
//    }
}
