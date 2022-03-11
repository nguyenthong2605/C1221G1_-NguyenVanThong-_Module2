package ss19_string_amp_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.Scanner;

public class ValidationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lop;
        do {
            System.out.println("Nhập tên lớp: ");
            lop = scanner.nextLine();
        } while (!Validation.checkLop(lop));
        System.out.println("Ok");
    }
}
