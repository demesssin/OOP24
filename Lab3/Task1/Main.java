package Lab3.Task1;

public class Main {
    public static void main(String[] args) {
        Flyable bird = new Bird("Eagle");
        Flyable plane = new Plane("Airbus");

        bird.fly();
        plane.fly();

        bird.distance();
        plane.distance();

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
