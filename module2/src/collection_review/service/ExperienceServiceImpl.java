package collection_review.service;

import collection_review.model.Experience;

import java.util.ArrayList;
import java.util.Scanner;

public class ExperienceServiceImpl implements IService {
    ArrayList<Experience> experienceArrayList = new ArrayList<>();

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
        System.out.println("explnYear: ");
        int explnYear = Integer.parseInt(scanner.nextLine());
        System.out.println("proSkill: ");
        String proSkill = scanner.nextLine();
        System.out.println("education");
        Experience experience = new Experience(id, firstName, lastName, birthDate, address, phone, email, explnYear, proSkill);
        experienceArrayList.add(experience);

    }

    @Override
    public void search() {
        boolean check = false;
        System.out.println("firstName: ");
        String firstName = scanner.nextLine();
        System.out.println("lastName: ");
        String lastName = scanner.nextLine();
        for (int i = 0; i < experienceArrayList.size(); i++) {
            if (experienceArrayList.get(i).getFirstName().equals(firstName) || experienceArrayList.get(i).getLastName().equals(lastName)) {
                check = true;
                System.out.println("User: " + experienceArrayList.get(i));
            }
        }
        if (!check) {
            System.out.println("It not found.");
        }
    }

    @Override
    public void display() {
        for (Experience experience : experienceArrayList) {
            System.out.println(experience);
        }
    }
}
