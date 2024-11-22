package practice6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create people
        Person alice = new Person("Alice", 25, 50);
        Person bob = new Person("Bob", 30, 15);
        Person charlie = new Person("Charlie", 20, 100);

        // Create a restaurant with a pizza price
        Restaurant pizzaHut = new Restaurant(35);

        // Serve people
        pizzaHut.service(alice);
        pizzaHut.service(bob);
        pizzaHut.service(charlie);

        // Add funds to Bob and serve again
        bob.addFunds(30);
        pizzaHut.service(bob);

        // List of people
        ArrayList<Person> people = new ArrayList<>();
        people.add(alice);
        people.add(bob);
        people.add(charlie);

        // Sort people by age
        Collections.sort(people);

        System.out.println("\nPeople sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Show final stats
        System.out.println("\nFinal Stats:");
        for (Person person : people) {
            System.out.println(person.getName() + " ate " + person.getPizzasEaten() + " pizzas.");
        }
    }
}
