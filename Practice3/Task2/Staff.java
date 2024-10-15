package Practice3.Task2;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public void setSchool(String someSchool){
        school = someSchool;
    }
    public String getSchool(){
        return school;
    }
    public void setPay(double somePay){
        pay = somePay;
    }
    public double getPay(){
        return pay;
    }

    public String toString(){
        return "Staff[" + super.toString() + ", school: " + school + ", pay: " + pay + "]";
    }
}
