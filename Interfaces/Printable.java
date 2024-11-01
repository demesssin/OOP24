package Interfaces;

public interface Printable {
    public void print();

    default void sayHello(){
        System.out.println("?HOLALAL!");
    }
    static void read(){
        System.out.println("Reading");
    }


}
