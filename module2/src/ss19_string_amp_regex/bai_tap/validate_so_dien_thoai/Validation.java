package ss19_string_amp_regex.bai_tap.validate_so_dien_thoai;

public class Validation {
    public static boolean checkSoDienThoai(String soDienThoai){
        String regex = "^\\(\\d{2}\\)-\\(\\d{10}\\)$";
        return soDienThoai.matches(regex);
    }
}
