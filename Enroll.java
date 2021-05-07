import java.util.HashMap;

//Enroll class
public class Enroll {

    HashMap<String,String> hm= new HashMap<>();

    public void enrollStudent(String stdID, String specialization) {
//        this.stdID = stdID;
//        this.specialization = specialization;
        hm.put(stdID,specialization);
    }

    public void displayEnrolledStudents() {
        for (String i : hm.keySet()) {
            System.out.println( i + " : " + hm.get(i));
        }
    }
}
