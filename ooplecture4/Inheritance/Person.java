package ooplecture4.Inheritance;

public class Person {
    private String name;

    public Person(){
        name = "no_name_yet";
    }
    public Person(String initialName){
        name = initialName;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

}

