package ooplecture4.Inheritance;

public class Persontest {
    public static void main(String[] args){
        Person p1 = new Person();
        System.out.println("Из суперкласса Person: " + p1.getName());
        p1.setName("Aidana");
        System.out.println("Из суперкласса Person: " + p1.getName());

        Student student1 = new Student();
        System.out.println("Из подкласса Student: " + student1.getName());
        System.out.println("Из подкласса Student: " + student1.getStudentNumber());
        student1.setName("Elmira");
        student1.setStudentNumber(30395);
        System.out.println("Из подкласса Student: " + student1.getName() + " " + student1.getStudentNumber());
    }
}
