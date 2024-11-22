package practice6;

public interface CanHavePizza {
    int SMALL_PIZZA = 25;
    int MEDIUM_PIZZA = 35;
    int LARGE_PIZZA = 50;

    void eat(int pizzaSize); // Eat a pizza of specific size
    boolean canAffordPizza(int pizzaPrice); // Check if the person can afford a pizza
}
