package Practice3.Task2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public void setProgram(String someProgram){
        program = someProgram;
    }
    public String getProgram(){
        return program;
    }
    public void setYear(int someYear){
        year = someYear;
    }
    public int getYear(){
        return year;
    }
    public void setFee(double someFee){
        fee = someFee;
    }
    public double getFee(){
        return fee;
    }

    public String toString(){
        return "Student[" + super.toString() + ", program = " + program + ", year = " + year + ", fee = " + fee + "]";
    }

}
