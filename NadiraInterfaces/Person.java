package NadiraInterfaces;

public class Person implements InfoInterface {
    private String name;
    private String iin;

    public Person(String name, String iin) {
        this.name = name;
        this.iin = iin;
    }

    @Override
    public String someActions() {
        return "running";
    }

    @Override
    public void makeSound() {
        System.out.println("hello wrold");;
    }

    @Override
    public String getDescription(){
        return "Person [name = " + name + ", iin = " + iin + "]";
    }

}
