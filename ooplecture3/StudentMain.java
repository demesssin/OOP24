package ooplecture3;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Yerassyl", "Kenzhegaly", 2.99);
        Student student2 = new Student("Akzhol", "Sadyk", 2.78);
        Student student3 = new Student("Adilet", "Salauat", 3.78);
        Student student4 = new Student("Aliyar", "Jurmaganbet", 4.00);
        Student student5 = new Student("Nurkhat", "Sarsenbay", 2.78);
        Student student6 = new Student("Nurkhat", "Sarsenbay", 3.58);
        Student student7 = new Student("Nurkhat", "Sarsenbay", 3.12);
        Student student8 = new Student("Nurkhat", "Sarsenbay", 2.11);
        Student student9 = new Student("Nurkhat", "Sarsenbay", 2.08);
        Student student10 = new Student("Nurkhat", "Sarsenbay", 2.01);

        Student[] students = new Student[10];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;
        students[7] = student8;
        students[8] = student9;
        students[9] = student10;

        Student topStudent = students[0];

        for (Student student : students){
            System.out.println(student.getStudentData());
        }
        for (int i = 1; i < students.length; i++){
            if ( students[i].gpa > topStudent.gpa){
                topStudent = students[i];
            };

        }
        System.out.println(topStudent.getStudentData());
    }
}
