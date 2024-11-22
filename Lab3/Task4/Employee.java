    package Lab3.Task4;

    import java.util.Date;

    public class Employee extends Person implements Comparable<Employee>, Cloneable{
        private int salary;
        private Date hireDate;
        private String iin;

        public Employee(String name, int salary, Date hireDate, String iin){
            super(name);
            this.salary = salary;
            this.hireDate = hireDate;
            this.iin = iin;
        }


        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Date getHireDate() {
            return hireDate;
        }

        public void setHireDate(Date hireDate) {
            this.hireDate = hireDate;
        }

        public String getIin() {
            return iin;
        }

        public void setIin(String iin) {
            this.iin = iin;
        }

        public String toString(){
            return super.toString() + "[ salary - " + getSalary() + ", hire date " + getHireDate() + ", iin " + getIin() + "]";
        }

        @Override
        public int compareTo(Employee o) {
            return 0;
        }
        @Override
        public Employee clone() throws CloneNotSupportedException {
            // Perform shallow clone: this will clone the current Employee object,
            // but the hireDate (Date) will still refer to the same object.
            return (Employee) super.clone();
        }

    }
