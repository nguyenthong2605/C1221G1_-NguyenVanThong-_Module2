package oop_review.oop_java_2.bai1.sap_xep;

import oop_review.oop_java_2.bai1.CongNhan;

import java.util.Comparator;

public class SapXepCongNhan implements Comparator<CongNhan> {
    @Override
    public int compare(CongNhan o1, CongNhan o2) {
        return o1.getHoVaTen().compareTo(o2.getHoVaTen());
    }
}
