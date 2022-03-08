package ss15_xu_li_ngoai_le_amp_debug.bai_tap.su_dung_lop_illegalTriangle_exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh c: ");
        int c = Integer.parseInt(scanner.nextLine());
        try {
            check(a,b,c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }

    }
    public static void check(int a, int b, int c) throws IllegalTriangleException{
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalTriangleException("Lỗi do nhập số âm.");
        }if (a+b <= c || a+c <= b || b+c <= a){
            throw new IllegalTriangleException("Lỗi tổng hai cạnh nhỏ hơn cạnh còn lại");
        }
        System.out.println("Là hình tam giác có cạnh 1: "+a+", cạnh 2: "+b+", cạnh 3: "+c);
    }

}
