package Lab2.Task5;

public class Main {
    public static void main(String[] args) {
        PersonRegistry registry = new PersonRegistry();

        Animal cat = new Cat("Murka", 3);
        Animal dog = new Dog("Rex", 2);
        Animal fish = new Fish("Naruto", 1);
        Animal bird = new Bird("Saske", 4);

        Person john = new Employee("John", 28, "Lecturer");
        Person pakita = new PhdStudent("Pakita", 35, "Q1");
        Person abzal = new Student("Abzal", 48, "Master");

        registry.addPerson(john);
        registry.addPerson(pakita);
        registry.addPerson(abzal);

        john.assignPet(cat);
        pakita.assignPet(dog);
        john.assignPet(bird);
        abzal.assignPet(fish);

        System.out.println(" =");

        registry.printDetails();



        /*
        System.out.println(pakita.getOccupation());
        System.out.println(john.getOccupation());
        System.out.println(abzal.getOccupation());

         */

    }
}
