package Compares;

public class Student /*implements Comparable<Student>*/ {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    @Override
    public String toString(){
        return name + " (" + age + " let, " + grade + " ballov)";
    }
}
