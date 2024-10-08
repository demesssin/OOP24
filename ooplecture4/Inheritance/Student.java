package ooplecture4.Inheritance;

public class Student extends Person {
    private int studentNumber;
    public Student(){
        super(); // Вызов конструктора суперкласса Person()
        studentNumber = 0;
    }
    public Student(String initialName, int initialStudentNumber){
        super(initialName); // Вызов конструктора суперкласса Person(String initialName)
        studentNumber = initialStudentNumber;
    }
    public void setStudentNumber(int newStudentNumber){
        studentNumber = newStudentNumber;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
}
