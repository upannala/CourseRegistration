import java.util.HashMap;

//Specialization class
public class Specialization {
    HashMap<String,Double> hm= new HashMap<>();

    public void addSpecialization( String specialization,double GPA) {
        hm.put(specialization,GPA);
    }

}
