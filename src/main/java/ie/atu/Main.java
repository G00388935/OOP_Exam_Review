package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of your Workshop");
        String workshopName = input.nextLine();

        System.out.println("How big is the capacity?");
        int capacity = Integer.parseInt(input.nextLine());

        Workshop workshop = new Workshop(workshopName, capacity);

        System.out.println("How many registrations do you want?");
        int registrations = Integer.parseInt(input.nextLine());

        System.out.println("workshop name: "+workshopName);//testing code
        System.out.println("Capacity: "+capacity);// testing code

        System.out.println("Number of registration attempts: "+registrations);

        int rejected = 0;
        int i =0;

        while(i < registrations)
        {
            System.out.println("Registration #"+(i+1));

            String studentIds  = input.nextLine();

            String result = workshop.registerStudent(studentIds);

            switch(result){
                case "registered":
                    System.out.println("Student "+studentIds +" was registered");
                    i++;
                    break;
                case "duplicate":
                    System.out.println("Student already registered");
                    rejected++;
                    break;
                case"full":
                    System.out.println("Capacity is full");
                    rejected++;
                    break;
                case "blank":
                    System.out.println("Student cant register as blank");
                    rejected++;
                    break;
                default:
                    break;
            }
        }

        System.out.println(workshop.getWorkshopName());

        for(int j=0;j< workshop.totalRegistrations();j++) {
            workshop.displayRegistrations();
        }

        System.out.println("Total number of registrations accepted: " + workshop.totalRegistrations());
        System.out.println("Total number of registrations rejected: " + rejected);
        System.out.println(workshop.getSpacesLeft());
    }
}