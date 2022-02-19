package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        int sum = 0;
        int column;
        int row;
        int[][] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập số cột: ");
            column = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số hàng: ");
            row = Integer.parseInt(scanner.nextLine());
            if (column > 5 || row > 5) {
                System.out.println("Số lượng phần tử lớn hơn 5.");
            }
        } while (column > 5 || row > 5);
        array = new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Nhập phần tử thứ: " + i + " và vị trí thứ: " + j);
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.print("Các phần tử trong mảng: \n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập cột muốn tính");
        int col = Integer.parseInt(input.nextLine());
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == col - 1) {
                    sum += array[i][col - 1];
                }
            }
        }
        System.out.println("Tổng các số trong cùng một cột= " + sum);
    }
}