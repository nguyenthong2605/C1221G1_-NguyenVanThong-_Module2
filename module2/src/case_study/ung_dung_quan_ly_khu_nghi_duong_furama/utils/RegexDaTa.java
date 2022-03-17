package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.utils;

import java.util.Scanner;

public class RegexDaTa {
    static Scanner scanner = new Scanner(System.in);
    public static String regexStr(String temp, String regex, String error){
        boolean check = true;
        do {
            if (temp.matches(regex)){
                check = false;
            }else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        }while (check);
        return temp;
    }
}
