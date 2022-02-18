package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Số lượng phần tử lớn hơn 10");
        } while (size > 10);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        //In ra mảng đã nhập
        System.out.printf("%-20s%s", "Các phần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //Duyệt mảng tìm vị trí cần xóa
        System.out.println("Nhập số cần xóa: ");
        int x = scanner.nextInt();
        boolean check = false;
        int index = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] == x) {
                check = true;
                index = k;
                System.out.println("Vị trí tìm thấy của " + x + "trong mảng là: " + index);
                break;
            }
        }
        //Xóa phần tử cần xóa trong mảng và trả về mảng mới
        for (int j = index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = 0;
        System.out.println(index);
        if (!check) {
            System.out.println("Không tìm thấy giá trị trong mảng." + x);
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
