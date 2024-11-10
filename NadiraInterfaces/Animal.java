package NadiraInterfaces;

public class Animal implements InfoInterface{

    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String someActions() {
        return "hunting";
    }

    @Override
    public void makeSound() {
        System.out.println("bark");
    }

    @Override
    public String getDescription(){
        return "Animal [name = " + name + ", age = " + age + "]";
    }
}
