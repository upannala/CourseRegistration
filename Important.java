//Interface
public interface Important {
    void showDetails();
    void addDetails(String Sname, String Saddress, char Ssex, int Sborn_year, String Sspecialization, String var);
    void addMarks(int mark1,int mark2,int mark3,int mark4,int mark5);
    String generateID() throws InvalidID;
}
