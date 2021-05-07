import java.util.*;


//Main method
public class Main {

    public static void main(String[] args) throws InvalidID {

        Weekend std1=new Weekend();
        std1.addDetails("Jane","Malabe",'F',2000,"DS","QA");
        String stdID=std1.generateID();
        std1.addMarks(78,89,45,87,44);
        std1.showDetails();
        System.out.println("Student ID : " + stdID);
        System.out.println();

        Weekday std2=new Weekday();
        std2.addDetails("Wimal","Gampaha",'M',1990,"SE","Friday");
        String stdID2=std1.generateID();
        std2.addMarks(68,59,45,77,55);
        std2.showDetails();
        System.out.println("Student ID : " + stdID2);
        System.out.println();

        Enroll seml=new Enroll();
        seml.enrollStudent (stdID, "DS");
        seml.enrollStudent (stdID2, "SE");
        System.out.println("\n\nEnrolled student details");
        seml.displayEnrolledStudents();
        Specialization spe =new Specialization();
        spe.addSpecialization("SE", 2.75);
        spe.addSpecialization("DS", 3.5);
    }

}
