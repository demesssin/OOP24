package Practice3;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public String makesound(){
        return "Woof-woof!";
    }
}
