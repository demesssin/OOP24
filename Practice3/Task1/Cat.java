package Practice3.Task1;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public String makesound(){
        return "Meow-meow";
    }
}
