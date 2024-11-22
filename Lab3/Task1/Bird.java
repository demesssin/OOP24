package Lab3.Task1;

public class Bird implements Flyable{
    public String name;
    public Bird(String name){
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " fly at the sky");
    }

    @Override
    public void distance() {
        System.out.println("It can fly 100km");
    }
}
