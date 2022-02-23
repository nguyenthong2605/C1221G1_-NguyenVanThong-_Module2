package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_quadratic_equation;

public class QuadracticEquation {
    double a, b, c, delta, r1, r2;

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return delta = Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return r1 = (-b + Math.sqrt(delta)) / 2 * a;
    }

    public double getRoot2() {
        return r2 = (-b - Math.sqrt(delta)) / 2 * a;
    }
}
