package case_study.ung_dung_quan_ly_khu_nghi_duong_furama.controllers;

import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.model.Employee;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.EmployeeService;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.impl.CustomerServiceImpl;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.impl.EmployeeServiceImpl;
import case_study.ung_dung_quan_ly_khu_nghi_duong_furama.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        CustomerServiceImpl customerService = new CustomerServiceImpl();

        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("------MENU------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit.");
            System.out.println("Enter choice.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choice1 = -1;
                    Scanner scanner1 = new Scanner(System.in);
                    while (choice1 != 0) {
                        System.out.println("---MENU Employee Management---");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        choice1 = Integer.parseInt(scanner1.nextLine());
                        switch (choice1) {
                            case 1:
                                employeeService.disPlay();
                                break;
                            case 2:
                                employeeService.add();
                                break;
                            case 3:
                                employeeService.edit();
                                break;
                            case 4:
                                choice1 = 0;
                                break;
                        }

                    }
                    break;
                case 2:
                    int choice2 = -1;
                    Scanner scanner2 = new Scanner(System.in);
                    while (choice2 != 0) {
                        System.out.println("---MENU Customer Management---");
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");
                        choice2 = Integer.parseInt(scanner2.nextLine());
                        switch (choice2) {
                            case 1:
                                customerService.disPlay();
                                break;
                            case 2:
                                customerService.add();
                                break;
                            case 3:
                                customerService.edit();
                                break;
                            case 4:
                                choice2 = 0;
                                break;
                        }
                    }
                    break;
                case 3:
                    int choice3 = -1;
                    Scanner scanner3 = new Scanner(System.in);
                    while (choice3 != 0) {
                        System.out.println("---MENU Facility Management---");
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        choice3 = Integer.parseInt(scanner3.nextLine());
                        switch (choice3) {
                            case 1:
                                facilityService.hienThi();
                                break;
                            case 2:
                                int choice4 = -1;
                                Scanner scanner4 = new Scanner(System.in);
                                while (choice4 != 0) {
                                    System.out.println("1. Add new villa.");
                                    System.out.println("2. Add new house");
                                    System.out.println("3. Add new room");
                                    System.out.println("4. Return main menu");
                                    choice4 = Integer.parseInt(scanner4.nextLine());
                                    switch (choice4) {
                                        case 1:
                                            facilityService.themMoiVilla();
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            choice4 = 0;
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                break;
                            case 4:
                                choice3 = 0;
                                break;
                        }
                    }
                    break;
                case 4:
                    int choice4 = -1;
                    Scanner scanner4 = new Scanner(System.in);
                    while (choice4 != 0) {
                        System.out.println("---MENU Booking Managerment---");
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new constracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        choice4 = Integer.parseInt(scanner4.nextLine());
                        switch (choice4) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                    }
                    break;
                case 5:
                    int choice5 = -1;
                    Scanner scanner5 = new Scanner(System.in);
                    while (choice5 != 0) {
                        System.out.println("---MENU Promotion Management---");
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        ;
                        choice5 = Integer.parseInt(scanner5.nextLine());
                        switch (choice5) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
