package practice6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* CanHavePizza cat = new Cat();
        CanHavePizza person = new Person();
        cat.eat();
        person.eat();

        Restaurant restaurant = new Restaurant();
        restaurant.service(cat);
        restaurant.service(person);*/

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort the list using the natural order defined by compareTo
        Collections.sort(people, Collections.reverseOrder());

        System.out.println("Sorted people by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
