package Lab2.Task5;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Murka", 3);
        Animal dog = new Dog("Rex", 2);
        Animal fish = new Fish("Naruto", 1);
        Animal bird = new Bird("Saske", 4);

        Person john = new Employee("Aibek", 28, "Lecturer");
        Person pakita = new PhdStudent("Pakita", 35, "Q1");
        Person abzal = new Student("Abzal", 48, "Master");

        System.out.println(cat.toString());

        john.assignPet(cat);
        System.out.println(john.toString());
        pakita.assignPet(dog);
        System.out.println(pakita.toString());
    }
}
