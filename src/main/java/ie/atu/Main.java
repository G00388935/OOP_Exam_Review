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

        System.out.println("How many registration attempts do you want?");
        int registrations = Integer.parseInt(input.nextLine());

        System.out.println("workshop name: "+workshopName);//testing code
        System.out.println("Capacity: "+capacity);// testing code

        System.out.println("Number of registration attempts: "+registrations);

        int rejected = 0;
        int accepeted = 0;
        int i =0;



        while(i < registrations){
            System.out.println("Registration #"+(accepeted+1));

            String studentIds  = input.nextLine();

            String result = workshop.registerStudent(studentIds);

                switch (result) {
                    case "registered":
                        System.out.println("Student " + studentIds + " was registered");
                        workshop.addStudent(studentIds);
                        accepeted++;
                        i++;
                        break;
                    case "duplicate":
                        System.out.println("Student already registered");
                        i++;
                        break;
                    case "blank":
                        System.out.println("Student cant register as blank");
                        rejected++;
                        i++;
                        break;
                    case"full":
                        System.out.println("Workshop is full");
                        i++;
                        rejected++;
                        break;
                    default:
                        break;
                }
            }


        System.out.println("Workshop : " + workshop.getWorkshopName());
        workshop.printStudents();
        System.out.println("Total number of registrations accepted: " + workshop.totalRegistrations());
        System.out.println("Total number of registrations rejected: " + rejected);
        System.out.println("Total number of spaces left: "+ workshop.getSpacesLeft());
    }
}