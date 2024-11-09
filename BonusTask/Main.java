package BonusTask;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Eagle", 5);
        Fish fish = new Fish("Goldfish", 1);
        Monkey monkey = new Monkey("Chimp", 3);
        Dog dog = new Dog("Rover", 4);

        System.out.println("== Bird Actions ==");
        bird.makeSound();
        bird.move();
        bird.sleep();
        bird.eat(10);
        bird.fly(5);
        bird.walk(3);

        System.out.println("\n== Fish Actions ==");
        fish.makeSound();
        fish.move();
        fish.sleep();
        fish.eat(5);
        fish.swim(4);

        System.out.println("\n== Monkey Actions ==");
        monkey.makeSound();
        monkey.move();
        monkey.sleep();
        monkey.eat(15);
        monkey.walk(6);
        monkey.climb(2);

        System.out.println("\n== Dog Actions ==");
        dog.makeSound();
        dog.move();7
        dog.sleep();
        dog.eat(8);
        dog.walk(7);
        dog.swim(3);
    }
}