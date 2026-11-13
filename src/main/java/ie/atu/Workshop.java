package ie.atu;

import java.util.HashSet;
import java.util.Set;


public class Workshop {
    private String workshopName;
    private int capacity;
    private HashSet<String> studentIds;

    public Workshop(String workshopName, int capacity) {
        this.workshopName = workshopName;
        this.capacity = capacity;
        this.studentIds = new HashSet<>();
    }

    public String registerStudent(String studentID){
        if(studentID == null|| studentID.isEmpty()){
            return "blank";
        }
        else if(studentIds.contains(studentID)){
            return "duplicate";
        }
        else if(capacity<=studentIds.size()){
            return"full";
        }
        else{
            return "registered";
        }
    }

    public void addStudent(String studentID){
        studentID = studentID.trim();
        studentID = studentID.toLowerCase();
        studentIds.add(studentID);
    }

    public void displayRegistrations(){
        System.out.println(studentIds);
    }

    public int totalRegistrations(){
        return studentIds.size();
    }

    public int getSpacesLeft(){
        return capacity-studentIds.size();
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void printStudents(){
        int k=1;
        for (String studentId : studentIds) {
            System.out.println("Student #"+k);
            System.out.println(studentId);
            k++;
        }
    }
}
