package Compares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Daryn", 55, 3.66));
        students.add(new Student("Nurkhat", 21, 3.22));
        students.add(new Student("Eraka", 165, 4.00));

        Collections.sort(students, new ageComparator());

        for (Student student : students){
            System.out.println(student);
        }
    }
}
