package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm: ");
        year = scanner.nextInt();
        boolean namNhuan = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    namNhuan = true;
                }
            } else {
                namNhuan = true;
            }
        }

        if (namNhuan) {
            System.out.printf("%d là năm nhuận.", year);
        } else {
            System.out.printf("%d không là năm nhuận.", year);
        }
    }
}
