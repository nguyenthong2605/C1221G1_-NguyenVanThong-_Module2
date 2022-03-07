package collection_review.controller;

import collection_review.service.ExperienceServiceImpl;
import collection_review.service.FresherServiceImpl;
import collection_review.service.InternServiceImpl;

import java.util.Scanner;

public class Controller {
    public void menu(){
        ExperienceServiceImpl experienceService = new ExperienceServiceImpl();
        FresherServiceImpl fresherService = new FresherServiceImpl();
        InternServiceImpl internService = new InternServiceImpl();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. EXit");
            System.out.println("Enter choice.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    experienceService.create();
                    break;
                case 2:
                    fresherService.create();
                    break;
                case 3:
                    internService.create();
                    break;
                case 4:
                    int choice2 = -1;
                    Scanner scanner2 = new Scanner(System.in);
                    while (choice2 != 0) {
                        System.out.println("Who do users search for?i:");
                        System.out.println("1.Search Experience .");
                        System.out.println("2.Search Fresher .");
                        System.out.println("3.Search Internship .");
                        choice2 = Integer.parseInt(scanner2.nextLine());
                        switch (choice2) {
                            case 1:
                                experienceService.search();
                                break;
                            case 2:
                                fresherService.search();
                                break;
                            case 3:
                                internService.search();
                                break;
                        }
                        break;
                    }
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
