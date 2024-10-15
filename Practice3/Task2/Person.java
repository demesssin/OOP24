package Practice3.Task2;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    public void setAddress(String someAddress){
        address = someAddress;
    }

    public String toString(){
        return "Person[name = " + name + ", address = " + address + "]";
    }
}
