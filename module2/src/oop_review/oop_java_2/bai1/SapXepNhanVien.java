package oop_review.oop_java_2.bai1;

import java.util.Comparator;

public class SapXepNhanVien implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return (o1.getHoVaTen().compareTo(o2.getHoVaTen()));
    }
}
