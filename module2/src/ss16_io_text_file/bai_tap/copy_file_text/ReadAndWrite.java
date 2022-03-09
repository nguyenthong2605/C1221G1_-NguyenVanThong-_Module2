package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String> readFile(String source) {
        List<String> string = new ArrayList<>();
        try {
            File file = new File(source);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                string.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return string;
    }


    public void writeFile(String filePath) {
        List<String> string1 = readFile("E:\\Codegym\\C1221G1_NguyenVanThong_Module2\\module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\source");
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < string1.size(); i++) {
                bufferedWriter.write(string1.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
