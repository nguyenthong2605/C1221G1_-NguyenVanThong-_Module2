package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    static int [] list = {1, 9, 4 , 6 , 7, 5};
    public static void main(String[] args) {
        int x;
        int pos;
        for (int i = 1; i < list.length; i++ ){
            x = list[i];
            pos = i;
            while (0<pos && x<list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
            System.out.println("Sau lần thứ "+i +": "+Arrays.toString(list));
        }
    }
}
