package Lab3.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of chocolates
        List<Chocolate> chocolates = new ArrayList<>(Arrays.asList(
                new Chocolate("Twix", 50.5),
                new Chocolate("Snickers", 45.0),
                new Chocolate("Mars", 52.3),
                new Chocolate("Bounty", 47.8)
        ));

        System.out.println("Before sorting chocolates:");
        chocolates.forEach(System.out::println);

        Sort.bubbleSort(chocolates);
        System.out.println("\nAfter Bubble Sort by weight:");
        chocolates.forEach(System.out::println);

        // Create a list of times
        List<Time> times = new ArrayList<>(Arrays.asList(
                new Time(2, 30, 45),
                new Time(1, 45, 30),
                new Time(3, 0, 15),
                new Time(1, 20, 0)
        ));

    }
}
