package Practice3.Task1;

public class Animal {
    private String name;

    public Animal(){
        System.out.println("Scream and shout");
    }
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String makesound(){
        return "Some generic sound";
    }
}
