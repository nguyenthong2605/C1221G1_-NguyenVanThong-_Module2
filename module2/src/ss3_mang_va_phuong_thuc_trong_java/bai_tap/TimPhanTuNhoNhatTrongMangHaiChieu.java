package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

public class TimPhanTuNhoNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[] array = {3,2,3,4,2,6,17,0,9,11,12};
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
                if (array[i] <= min){
                    min = array[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là: "+min);
    }
}
