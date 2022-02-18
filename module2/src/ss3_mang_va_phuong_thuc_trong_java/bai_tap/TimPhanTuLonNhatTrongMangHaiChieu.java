package ss3_mang_va_phuong_thuc_trong_java.bai_tap;


public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int max = array[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j] > max){
                   max = array[i][j];
                   row = i;
                   col = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là: "+max+" Vị trí hàng "+row+" cột "+col);
    }
}
