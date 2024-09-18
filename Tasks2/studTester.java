package Tasks2;

public class studTester {
    public static void main(String[] args) {
        probStudent student = new probStudent("Nadira", 18);
        student.setName("Nurkhat");
        student.setId(30395);
        student.inc_year_of_study();
        student.inc_year_of_study();
        System.out.println("Пример работы кода тут использует энкапсуляцию " + student.getName() + " " + student.getId() + " " + student.getYear_of_study());
    }
}
