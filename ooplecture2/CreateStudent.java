package ooplecture2;

public class CreateStudent {
    public static void main(String[] args){
        Student student1 = new Student("Demessin", 30395,18 );
        student1.setName("Abzal");
        student1.setAge(48);
        System.out.println("Вывели значение с помощью энкапсуляции " + student1.getName() + " " + student1.getAge());

    }
}
