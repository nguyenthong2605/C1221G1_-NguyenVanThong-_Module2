package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố.");
        System.out.println("Nhập số nguyên tố: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.printf(n+" ");
            }
            n++;
        }
    }
}
