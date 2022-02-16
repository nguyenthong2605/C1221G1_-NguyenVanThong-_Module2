package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double canNang, chieuCao, chiSo;
        System.out.print("Nhập cân nặng (kg): ");
        canNang = scanner.nextDouble();

        System.out.print("Nhập chiều cao (m): ");
        chieuCao = scanner.nextDouble();
        chiSo = canNang/Math.pow(chieuCao, 2);

        System.out.printf("%-20s%s", "chiSo", "Interpretation\n");

        if (chiSo < 18 )
            System.out.printf("%-20.2f%s", chiSo, "Underweight");
        else if (chiSo < 25.0)
            System.out.printf("%-20.2f%s", chiSo, "Normal");
        else if (chiSo < 30.0)
            System.out.printf("%-20.2f%s", chiSo, "Overweight");
        else
            System.out.printf("%-20.2f%s", chiSo, "Obese");
    }
}
