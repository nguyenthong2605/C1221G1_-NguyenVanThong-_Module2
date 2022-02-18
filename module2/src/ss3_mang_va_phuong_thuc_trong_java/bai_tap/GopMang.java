package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array1.length) {
            System.out.println("Nhập phần tử " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng 1: ", "");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        int k = 0;
        while (k < array2.length) {
            System.out.println("Nhập phần tử " + (k + 1) + ": ");
            array2[k] = scanner.nextInt();
            k++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng 2 : ", "");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }
        int[] array3 = new int[array1.length + array2.length];
        for (int j = 0 ;  j <array1.length ; j++) {
            array3[j]=array1[j];
        }
        for (int j = 0; j < array2.length ; j++) {
            array3[array1.length+j]=array2[j];
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng 3 : ", "");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + "\t");
        }
    }
}
