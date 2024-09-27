package Lab1.Gradebook;

public class Course {
    private String courseName;
    private  String description;

    public Course(String description, String courseName){
        this.courseName = courseName;
        this.description = description;
    }

    public void setCourseName( String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

}
