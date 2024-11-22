package Lab3.Task4;

public class Person {
    public String name;
    public Person(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "[ name" + name + "]";
    }
    public String getName(){
        return name;
    }
}
