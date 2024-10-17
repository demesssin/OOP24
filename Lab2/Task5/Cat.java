package Lab2.Task5;

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age, "Cat");
    }
    @Override
    public String getSound(){
        return "Meow";
    }
}
