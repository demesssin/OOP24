package Lab2.Task5;

public abstract class Animal{
    private String name;
    private int age;
    private String type;
    public Animal(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public void setName(String someName){
        name = someName;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }

    public void setAge(int someAge){
        age = someAge;
    }
    public int getAge(){
        return age;
    }
    public abstract String getSound();

    public String toString(){
        return name + " (" + age + " years old )";
    }
}
