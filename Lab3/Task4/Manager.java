package Lab3.Task4;

import java.util.Comparator;
import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Cloneable{
    public Vector<Employee> manager1 = new Vector<>();
    private double bonus;

    public Manager(String name, int salary, Date hireDate, String iin, double bonus) {
        super(name, salary, hireDate, iin);
        this.manager1 = new Vector<>();
        this.bonus = bonus;
    }

    public void addToTeam(Employee employee){
        manager1.add(employee);
    }
    public Vector<Employee> getManager1(){
        return manager1;
    }
    public double getBonus(){
        return bonus;
    }
    @Override
    public String toString(){
        return "Manager{name='" + getName() + "', salary=" + getSalary() + ", hireDate=" + getHireDate() + ", bonus=" + bonus + ", team=" + manager1.size() + " employees}";
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        // Perform shallow clone: this will clone the Manager object, but the
        // manager1 vector will still refer to the same objects (it won't be deep cloned).
        Manager clonedManager = (Manager) super.clone();
        clonedManager.manager1 = new Vector<>(this.manager1);  // Create a new vector but still points to original employees
        return clonedManager;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!super.equals(obj)){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Manager manager = (Manager) obj;
        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Double.valueOf(bonus).hashCode();
    }

    public int compareTo(Employee other){
        if (this.getSalary() != other.getSalary()){
            return Integer.compare(this.getSalary(), other.getSalary());
        }
        if (other instanceof  Manager){
            Manager manager = (Manager) other;
            return Double.compare(this.bonus, manager.bonus);
        }
        return 0;
    }

    public static final Comparator<Employee> byName = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static final Comparator<Employee> byHireDate = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getHireDate().compareTo(o2.getHireDate());
        }
    };

}
