package ooplecture3;

public class Student {
    public String name;
    public String surname;
    public double gpa;
    public Student(String name, String surname, double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public String getStudentData(){
        return "Name " + name + " , Surname " + surname + " , GPA " + gpa;
    }
}
