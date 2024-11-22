package practice6;

public class Person implements CanHavePizza, Comparable<Person> {
    private String name;
    private int age;
    private int wallet; // How much money the person has
    private int pizzasEaten; // Count of pizzas eaten

    public Person(String name, int age, int wallet) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.pizzasEaten = 0;
    }

    public Person() {
        this.pizzasEaten = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWallet() {
        return wallet;
    }

    public int getPizzasEaten() {
        return pizzasEaten;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addFunds(int amount) {
        this.wallet += amount;
        System.out.println(name + " added $" + amount + " to their wallet.");
    }

    @Override
    public void eat(int pizzaSize) {
        System.out.println(name + " is eating a pizza of size " + pizzaSize + " cm!");
        pizzasEaten++;
    }

    @Override
    public boolean canAffordPizza(int pizzaPrice) {
        if (wallet >= pizzaPrice) {
            wallet -= pizzaPrice;
            System.out.println(name + " paid $" + pizzaPrice + " for the pizza. Remaining balance: $" + wallet);
            return true;
        } else {
            System.out.println(name + " cannot afford the pizza. Wallet balance: $" + wallet);
            return false;
        }
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", wallet=$" + wallet + ", pizzasEaten=" + pizzasEaten + "}";
    }
}
