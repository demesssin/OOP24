package BonusTaskCv;

public class Staff extends User{
    public double salary;
    public String subjects;

    public Staff(int id, String login, String password, String name, String surname, double salary, String subjects) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.subjects = subjects;
    }

    @Override
    public String getData(){
        return salary + " , " + subjects;
    }

}
