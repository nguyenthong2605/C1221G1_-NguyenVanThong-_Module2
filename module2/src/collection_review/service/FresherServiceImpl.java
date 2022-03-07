package collection_review.service;

import collection_review.model.Experience;
import collection_review.model.Fresher;

import java.util.ArrayList;
import java.util.Scanner;

public class FresherServiceImpl implements IService {
    ArrayList<Fresher> fresherArrayList = new ArrayList<>();

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
        System.out.println("graduationDate: ");
        int graduationDate = Integer.parseInt(scanner.nextLine());
        System.out.println("graduationRank: ");
        int graduationRank = Integer.parseInt(scanner.nextLine());
        System.out.println("education: ");
        String education = scanner.nextLine();
        Fresher fresher = new Fresher(id, firstName, lastName, birthDate, address, phone, email, graduationDate, graduationRank, education);
        fresherArrayList.add(fresher);

    }

    @Override
    public void search() {
        boolean check = false;
        System.out.println("firstName: ");
        String firstName = scanner.nextLine();
        System.out.println("lastName: ");
        String lastName = scanner.nextLine();
        for (int i = 0; i < fresherArrayList.size(); i++) {
            if (fresherArrayList.get(i).getFirstName().equals(firstName) || fresherArrayList.get(i).getLastName().equals(lastName)) {
                check = true;
                System.out.println("User: " + fresherArrayList.get(i));
            }
        }
        if (!check) {
            System.out.println("It not found.");
        }

    }

    @Override
    public void display() {
        for (Fresher fresher : fresherArrayList) {
            System.out.println(fresher);
        }
    }
}