package Practice3.Task1;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public String makesound(){
        return "Woof-woof!";
    }
}
