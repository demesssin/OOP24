package Practice3.Task2;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Person> people  = new Vector<>();

        Person p1 = new Person("Yerassyl", "1K - 4A");
        Student s1 = new Student("Aidyn", "2K - 4A", "OOP24", 2024, 4312.88);
        Staff staff1 = new Staff("Nadira", "Tole Bi 59", "SITE", 5555.59);
        System.out.println(p1.getName() + " " + p1.getAddress());
        System.out.println(p1.toString());

        p1.setAddress("Turgut Ozal 80");
        s1.setProgram("Database 24");
        s1.setYear(2012);
        s1.setFee(4555.36);

        Student s2 = new Student(p1.getName(), s1.getAddress(), s1.getProgram() ,s1.getYear(),s1.getFee());

        people.add(s2);

        /*people.add(p1);
        people.add(s1);
        people.add(staff1);
         */
        for (Person p : people){
            System.out.println(p);
        }
    }
}
