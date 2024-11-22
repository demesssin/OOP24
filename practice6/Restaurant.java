package practice6;

public class Restaurant {
    private int pizzaPrice;

    public Restaurant(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public boolean service(CanHavePizza eater) {
        if (eater instanceof Person) {
            Person person = (Person) eater;
            System.out.println("Serving " + person.getName() + "...");

            if (person.canAffordPizza(pizzaPrice)) {
                eater.eat(CanHavePizza.MEDIUM_PIZZA);
                System.out.println("Enjoy your pizza, " + person.getName() + "!");
                return true;
            } else {
                System.out.println(person.getName() + " needs more money to buy a pizza.");
            }
        } else {
            System.out.println("Only persons can be served!");
        }
        return false;
    }
}
