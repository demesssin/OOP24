package Interfaces;

public class WithNestedInterface implements Printer.showName{
    String name;

    public WithNestedInterface(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name + " lol LOL ");
    }
}
