package ss19_string_amp_regex.bai_tap.validate_ten_cua_lop_hoc;

public class Validation {
    public static boolean checkLop(String lop){
        String regex = "^[CAP]\\d{4}[GHJKLM]$";
        return lop.matches(regex);
    }
}
