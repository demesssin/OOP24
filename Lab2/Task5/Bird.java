package Lab2.Task5;

public class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age, "Cat");
    }
    @Override
    public String getSound(){
        return "Chik-chirik";
    }
}
