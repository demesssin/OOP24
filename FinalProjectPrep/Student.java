package FinalProjectPrep;

public class Student {
    public int id;
    public String name;
    public String lastname;
    public double gpa;
    public int course;
    public Major major;

    public Student(String name, String lastname, double gpa, int course, Major major){
        this.name = name;
        this.lastname = lastname;
        this.gpa = gpa;
        this.course = course;
        this.major = major;
    }

    public String getName() {
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    public double getGpa(){
        return gpa;
    }
    public int getCourse(){
        return course;
    }
    public Major getMajor(){
        return major;
    }

    public String toString(){
        return "Student = [ " + name + " " + lastname + ", gpa: " + gpa + ", course: " + course + ", major: " + major + " ]";
    }
}
