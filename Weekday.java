//implements Important Interface
public class Weekday implements Important {
    private String name, address;
    private char sex;
    private int born_year;
    private String specialization;
    private String free_day;
    private int[] marks=new int[5];

    @Override
    public String generateID() throws InvalidID {
        int min = 1;
        int max = 100000000;

        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String ID = "IT" + random_int;

        if (ID.length() < 4)
            throw new InvalidID("not valid");
        else
            return ID;
    }

    @Override
    public void addDetails(String Sname, String Saddress, char Ssex, int Sborn_year, String Sspecialization, String Sfree_day) {
        name = Sname;
        address = Saddress;
        sex = Ssex;
        born_year = Sborn_year;
        specialization = Sspecialization;
        free_day = Sfree_day;
    }

    //Overriding methods in Important Interface
    @Override
    public void showDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Address : " + address);
        System.out.println("Gender : " + sex);
        System.out.println("Student Year : " + born_year);
        System.out.println("Student Specialization : " + specialization);
        System.out.println("Free Day : " + free_day);
    }

    @Override
    public void addMarks(int mark1, int mark2, int mark3, int mark4, int mark5) {
        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;
        marks[3] = mark4;
        marks[4] = mark5;
    }

}
