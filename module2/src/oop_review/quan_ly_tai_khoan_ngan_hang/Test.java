package oop_review.quan_ly_tai_khoan_ngan_hang;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Account account1 = new Account(2652000,"Nguyễn Văn Thông",50);
        Account account2 = new Account(7102000,"Huỳnh Thị Út Quyên",10);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println("Huỳnh Thị Út Quyên nạp tiền vào tài khoản!");
        account2.napTien();
        System.out.println(account2);
        System.out.println("Nguyễn Văn Thông rút tiền từ tài khoản!");
        account1.rutTien();
        System.out.println(account1);
        System.out.println("Nguyễn Văn Thông đến kỳ đáo hạn!");
        account1.daoHan();
        System.out.println(account1);
        System.out.println("Nguyễn Văn Thông chuyển khoản cho Huỳnh Thị Út Quyên với số tiền: ");
        account1.chuyenTien(account2);
    }
}
