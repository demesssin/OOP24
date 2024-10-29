package prepmid2;

public abstract class Vacancy {
    public int salary;
    public String needMajority;

    public Vacancy(int salary, String needMajority){
        this.salary = salary;
        this.needMajority = needMajority;
    }

    public abstract void interview();
}
