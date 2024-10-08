package BonusTaskCv;

public class Student extends User{
    public double gpa;
    public String courses;
    public Student(int id, String login, String password, String name, String surname, double gpa, String courses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.courses = courses;
    }

    @Override
    public String getData(){
        return gpa + " , " + courses;
    }
}
