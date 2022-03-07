package collection_review.service;

import collection_review.model.Fresher;
import collection_review.model.Intern;

import java.util.ArrayList;
import java.util.Scanner;

public class InternServiceImpl implements IService {
    ArrayList<Intern> internArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void create() {
        System.out.println("id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("firstName: ");
        String firstName = scanner.nextLine();
        System.out.println("lastName: ");
        String lastName = scanner.nextLine();
        System.out.println("birthDate: ");
        int birthDate = Integer.parseInt(scanner.nextLine());
        System.out.println("address: ");
        String address = scanner.nextLine();
        System.out.println("phone: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("email: ");
        String email = scanner.nextLine();
        System.out.println("majors: ");
        String majors = scanner.nextLine();
        System.out.println("semester: ");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.println("universityName: ");
        String universityName = scanner.nextLine();
        Intern intern = new Intern(id, firstName, lastName, birthDate, address, phone, email, majors, semester, universityName);
        internArrayList.add(intern);
    }

    @Override
    public void search() {
        boolean check = false;
        System.out.println("firstName: ");
        String firstName = scanner.nextLine();
        System.out.println("lastName: ");
        String lastName = scanner.nextLine();
        for (int i = 0; i < internArrayList.size(); i++) {
            if (internArrayList.get(i).getFirstName().equals(firstName) || internArrayList.get(i).getLastName().equals(lastName)) {
                check = true;
                System.out.println("User: " + internArrayList.get(i));
            }
        }
        if (!check) {
            System.out.println("It not found.");
        }
    }

    @Override
    public void display() {
        for (Intern intern : internArrayList) {
            System.out.println(intern);

        }
    }
}
