package Lab1.Gradebook;

public class Grade {
    private Course course;
    private Course description;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;

    public Grade(Course course, Student student1, Student student2, Student student3, Student student4, Student student5){
        this.course = course;
        this.description = description;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
        this.student4 = student4;
        this.student5 = student5;
    }
    public void displayMessage(){
        System.out.println("Welcome to the gradebook for " + course.getDescription() + " " + course.getCourseName());
    }
    public void displayGradeReport(){
        /*System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

         */
        System.out.print("Class average is " + determineClassAverage() + ". ");
        System.out.println("The lowest grade is " + worstGrade());
        System.out.println("The highest grade is " + bestGrade());
    }
    private double determineClassAverage(){
        return ((student1.getGrade() + student2.getGrade() + student3.getGrade() + student4.getGrade() + student5.getGrade()) / 5);
    }
    private int bestGrade(){
        int[] grades = {student1.getGrade(), student2.getGrade(), student3.getGrade(), student4.getGrade(), student5.getGrade()};
        int maxGrade = grades[0];
        for (int i = 1; i < grades.length; i++){
            if (grades[i] > maxGrade){
                maxGrade = grades[i];
            }
        }
        return maxGrade;
    }
     private int worstGrade(){
         int[] grades = {student1.getGrade(), student2.getGrade(), student3.getGrade(), student4.getGrade(), student5.getGrade()};
         int worstGrade = grades[0];
         for (int i = 1; i < grades.length; i++){
             if (grades[i] < worstGrade){
                 worstGrade = grades[i];
             }
         }
         return worstGrade;
     }
    /*
     public void displayGradeDistribution() {
        int[] gradeDistribution = new int[11];


        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            int grade = student.getGrade();
            if (grade >= 0 && grade <= 100) {
                gradeDistribution[grade / 10]++;
            }
        }
        System.out.println("Grades distribution:");
        for (int i = 0; i < gradeDistribution.length; i++) {
            System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
*/
}

