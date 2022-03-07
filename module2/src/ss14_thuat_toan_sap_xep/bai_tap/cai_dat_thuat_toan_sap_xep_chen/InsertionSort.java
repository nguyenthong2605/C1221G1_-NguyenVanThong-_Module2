package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {1, 9, 4, 6, 7, 5, 10, 22, 31, 2};

    public static void insertionSort(int[] arr) {
        int x;
        int pos;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (0 < pos && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
            System.out.println("Sau lần thứ " + i + ": " + Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
