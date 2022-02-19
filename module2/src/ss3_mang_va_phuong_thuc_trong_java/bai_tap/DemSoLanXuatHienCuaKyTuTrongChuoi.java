package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = "nguyenvanthong";
        int count = 0;
        System.out.println("Nhập ký tự: ");
        char symbol = input.nextLine().charAt(0);
        System.out.println(symbol);
        for (int i = 0; i < string.length(); i++) {
            if (symbol == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Tổng số lần xuất hiện của kí tự " + symbol + " là: " + count);
    }
}
