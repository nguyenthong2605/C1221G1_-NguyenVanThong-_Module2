package ss4_lop_va_doi_tuong_trong_java.bai_tap.XayDungLopQuadraticEquation;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 số a,b,c.");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadracticEquation quadracticEquation = new QuadracticEquation(a, b, c);
        System.out.println("Giải pt ta có: ");
        if (quadracticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt. " + quadracticEquation.getRoot1() + quadracticEquation.getRoot2());
        } else if (quadracticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
            System.out.println("Phường trình có nghiệm kép." + quadracticEquation.getRoot1());
        }
    }
}

