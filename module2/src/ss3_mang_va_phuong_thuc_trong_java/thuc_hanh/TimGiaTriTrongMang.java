package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class  TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        String inputName = scanner.nextLine();
    boolean check = false;
    for (int i = 0; i<students.length; i++){
        if (students[i].equals(inputName)){
            System.out.println("Tên có trong danh sách: "+inputName+" vị trí: "+i);
            check = true;
            break;
        }
    }
    if (!check){
        System.out.println("Không tìm thấy tên "+inputName+" trong danh sách.");
    }
    }
}
