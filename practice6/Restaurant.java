package practice6;

public class Restaurant {
    boolean service(CanHavePizza eater){
        if(eater instanceof Person){
            System.out.println("Person must pay");
        }
        return true;
    }
}
