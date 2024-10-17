package Lab2.Task5;

public class Employee extends Person{
    private String job;
    public Employee(String name, int age, String job){
        super(name, age);
        this.job = job;
    }
    public String getOccupation(){
        return "Emplpoyee: " + job;
    }
    public void setJob(String someJob){
        job = someJob;
    }
    public String getJob(){
        return job;
    }

}
