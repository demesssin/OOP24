package Lab1.Gradebook;

public class Student {
    private String name;
    private int id;
    private int grade;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
        this.grade = 0;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
    @Override
    public String toString(){
        return "Student "+ name + ": " + grade;
    }
}
