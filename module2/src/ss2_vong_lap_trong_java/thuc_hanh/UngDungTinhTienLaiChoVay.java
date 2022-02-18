package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = sc.nextInt();
        System.out.println("Nhập lãi xuất: ");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++ ){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tiền lãi cho vay: "+totalInterest);
    }
}
