package ss19_string_amp_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class ValidationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soDienThoai;
        do {
            System.out.println("Nhập số điện thoại: ");
            soDienThoai = scanner.nextLine();
        }while (!Validation.checkSoDienThoai(soDienThoai));
        System.out.println("Okei!");
    }
}
