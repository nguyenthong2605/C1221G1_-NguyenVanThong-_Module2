package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.utils;

import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.*;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    private static String EMPLOYEE_FILE = "module2\\src\\case_study\\ung_dung_quan_ly_khu_nghi_duong_furama\\data\\employee.csv";

    private static String CUSTOMER_FILE = "module2\\src\\case_study\\ung_dung_quan_ly_khu_nghi_duong_furama\\data\\customer.csv";

    private static String CONTRACT_FILE = "module2\\src\\case_study\\ung_dung_quan_ly_khu_nghi_duong_furama\\data\\contract.csv";

    private static String BOOKING_FILE = "module2\\src\\case_study\\ung_dung_quan_ly_khu_nghi_duong_furama\\data\\booking.csv";

    private static String HOUSE_FILE = "module2\\src\\case_study\\ung_dung_quan_ly_khu_nghi_duong_furama\\data\\file_facility\\house.csv";

    private static String ROOM_FILE = "module2\\src\\case_study\\ung_dung_quan_ly_khu_nghi_duong_furama\\data\\file_facility\\room.csv";

    private static String VILLA_FILE = "module2\\src\\case_study\\ung_dung_quan_ly_khu_nghi_duong_furama\\data\\file_facility\\villa.csv";

    // phương thức đọc ra một danh sách  dạng string từ csv. Phương thức dùng chung
    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    // phương tổng quát để ghi 1 list kiểu string vào trong file csv.Phương thức dùng chung
    private static void writeListStringFromCSV(String filePath, List<String> stringList, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //ĐỌc và ghi ra một danh sách Employee
    public static List<Employee> readEmployeeListFromCSV() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(EMPLOYEE_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Employee employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    public static void writeEmployeeListFromCSV(List<Employee> employeeList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfoToCSV());
        }
        writeListStringFromCSV(EMPLOYEE_FILE, stringList, append);
    }


    //Đọc và ghi ra một danh sách Customer
    public static List<Customer> readCustomerListFromCSV() {
        List<Customer> customerList = new LinkedList<>();
        List<String> stringList = readListStringFromCSV(CUSTOMER_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                customerList.add(customer);
            }
        }
        return customerList;
    }

    public static void writeCustomerListFromCSV(List<Customer> customerList, boolean append) {
        List<String> stringList = new LinkedList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getInfoToCSV());
        }
        writeListStringFromCSV(CUSTOMER_FILE, stringList, append);
    }


    //ĐỌc và ghi ra một danh sách House
    public static List<House> readHouseListFromCSV() {
        List<House> houseList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(HOUSE_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                House house = new House(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], Integer.parseInt(arr[7]));
                houseList.add(house);
            }
        }
        return houseList;
    }

    public static void writeHouserListFromCSV(List<House> houseList, boolean append) {
        List<String> stringList = new LinkedList<>();
        for (House house : houseList) {
            stringList.add(house.getInfoToCSV());
        }
        writeListStringFromCSV(HOUSE_FILE, stringList, append);
    }

    //ĐỌc và ghi ra một danh sách Villa
    public static List<Villa> readVillaListFromCSV() {
        List<Villa> villaList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(VILLA_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Villa villa = new Villa(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                villaList.add(villa);
            }
        }
        return villaList;
    }

    public static void writeVillaListFromCSV(List<Villa> villaList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Villa villa : villaList) {
            stringList.add(villa.getInfoToCSV());
        }
        writeListStringFromCSV(VILLA_FILE, stringList, append);
    }

    //Đọc và ghi ra một danh sách Room
    public static List<Room> readRoomListFromCSV() {
        List<Room> roomList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(ROOM_FILE);
        String[] arr = null;
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                arr = stringList.get(i).split(",");
                Room room = new Room(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6]);
                roomList.add(room);
            }
        }
        return roomList;
    }

    public static void writeRoomListFromCSV(List<Room> roomList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Room room : roomList) {
            stringList.add(room.getInfoToCSV());
        }
        writeListStringFromCSV(ROOM_FILE, stringList, append);
    }
}
