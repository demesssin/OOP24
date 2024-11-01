package Interfaces;

public class Journal implements Printable{
    private String name;

    String getName(){
        return name;
    }

    public Journal(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println(name);
    }
}
