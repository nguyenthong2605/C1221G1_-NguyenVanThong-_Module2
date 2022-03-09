package ss16_io_text_file.bai_tap.copy_file_text;

public class Test {
    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        System.out.println(readAndWrite.readFile("E:\\Codegym\\C1221G1_NguyenVanThong_Module2\\module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\source"));
        readAndWrite.writeFile("E:\\Codegym\\C1221G1_NguyenVanThong_Module2\\module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\target");
    }
}
