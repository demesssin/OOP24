package Lab3.Task1;

public class Plane implements Flyable{
    public String model;
    public Plane(String model){
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println(model + " fly to the Bali");
    }

    @Override
    public void distance() {
        System.out.println("It can fly 5000km");
    }
}
