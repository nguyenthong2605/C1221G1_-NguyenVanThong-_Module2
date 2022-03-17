package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.utils;

import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Employee> readFileEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        File file = new File("E:\\Codegym\\C1221G1_NguyenVanThong_Module2\\module2\\src\\case_study\\ung_dung_quan_ly_khu_nghi_duong_furama\\data\\employee.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            if (file.length()>0){
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while (!((line = bufferedReader.readLine())!=null)){
                    // "adc","24/4","78","da nang"
                    String[] items = line.split(",");
                    String name = items[0];

                    Employee newEmployee = new Employee(...);
                    employeeList.add(newEmployee);

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
