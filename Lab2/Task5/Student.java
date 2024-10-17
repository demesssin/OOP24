package Lab2.Task5;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class Student extends Person{
    private String major;
    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }
    @Override
    public String getOccupation(){
        return "Student major: " + major;
    }

    public void setMajor(String someMajor){
        major = someMajor;
    }
    public String getMajor(){
        return major;
    }

}
