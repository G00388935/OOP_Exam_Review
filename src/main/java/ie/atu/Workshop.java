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

        studentID = studentID.trim();
        studentID = studentID.toLowerCase();

        if(studentIds.contains(studentID)){
            return "duplicate";
        }

        if(studentIds.size() > capacity){
            return "full";
        }

        studentIds.add(studentID);

        return "registered";
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
}
