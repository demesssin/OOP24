package BonusTask;

abstract class Animal {
    protected String name;
    protected int age;
    protected int energy = 100;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
    public abstract void move();

    public void sleep() {
        energy += 20;
        System.out.println(name + " is sleeping and gaining energy.");
    }

    public void eat(int foodEnergy) {
        energy += foodEnergy;
        System.out.println(name + " is eating and gaining " + foodEnergy + " energy.");
    }

    protected void reduceEnergy(int amount, String action) {
        if (energy >= amount) {
            energy -= amount;
            System.out.println(name + " " + action + ". Energy now: " + energy);
        } else {
            System.out.println(name + " is too tired to " + action + ".");
        }
    }
}
