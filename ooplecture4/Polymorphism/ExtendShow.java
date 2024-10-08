package ooplecture4.Polymorphism;

public class ExtendShow extends SuperShow {
    public String str = "ExtendStr";
    public void show(){
        System.out.println("Extend.show: " + str);
    }
}
