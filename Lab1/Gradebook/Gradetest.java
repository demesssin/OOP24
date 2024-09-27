package Lab1.Gradebook;
import java.util.Scanner;

public class Gradetest {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Object-oriented Programming and Design!");
        Student student1 = new Student("Student A: ",1);
        Student student2 = new Student("Student B: ",2);
        Student student3 = new Student("Student C: ",3);
        Student student4 = new Student("Student D: ",4);
        Student student5 = new Student("Student E: ",5);

        Grade gradebook = new Grade(course, student1, student2, student3, student4, student5);
        gradebook.displayMessage();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input the grades for students: ");

        System.out.print(student1.getName() + ": ");
        student1.setGrade(scan.nextInt());

        System.out.print(student2.getName() + ": ");
        student2.setGrade(scan.nextInt());

        System.out.print(student3.getName() + ": ");
        student3.setGrade(scan.nextInt());

        System.out.print(student4.getName() + ": ");
        student4.setGrade(scan.nextInt());

        System.out.print(student5.getName() + ": ");
        student5.setGrade(scan.nextInt());


        gradebook.displayGradeReport();
        // gradebook.displayGradeDistribution();
    }
}
