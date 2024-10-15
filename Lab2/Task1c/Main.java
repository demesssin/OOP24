package Lab2.Task1c;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Dog> dogSet = new HashSet<>();

        Dog d1 = new Dog("Max", 5, "Labrador");
        Dog d2 = new Dog("Max", 5, "Labrador");
        Dog d3 = new Dog("Bella", 3, "Beagle");

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));

        dogSet.add(d1);
        dogSet.add(d2);
        dogSet.add(d3);

        for (Dog p : dogSet){
            System.out.println(p);
        }
    }
}
