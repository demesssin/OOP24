package ooplecture4.OverrideOverload;

public class Dog extends Animal {

    @Override
    public String voice(){
        return "gav";
    }

    void findPedigree(){
        System.out.println("Pedigree found! Yahooo");
    }
}
