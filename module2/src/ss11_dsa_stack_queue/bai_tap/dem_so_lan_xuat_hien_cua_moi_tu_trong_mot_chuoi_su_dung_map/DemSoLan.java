package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DemSoLan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi: ");

        String str = scanner.nextLine();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        str = str.toLowerCase();
        char character;
        for (int i = 0; i < str.length(); i++){
            character = str.charAt(i);
            if (treeMap.containsKey(character)){
                treeMap.replace(character,treeMap.get(character)+1);
            }else {
                treeMap.put(character, 1);
            }
        }
        Set<Character> keySet = treeMap.keySet();
        for (char key: keySet) {
            System.out.println(key + " - " + treeMap.get(key));

            
        }
    }
}
