package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Số lượng phần tử lớn hơn 10.");
        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("Nhập số cần chèn: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index <= -1 && index >= array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            for (int j = array.length-1; j > index; j--) {
                    array[j] = array[j-1];
            }array[index] = x;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
