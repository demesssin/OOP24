package ooplecture4.Equals;

public class    Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("Tesla");
        Car car2 = new Car("Tesla");

        Car car3 = new Car("Camry 70");
        Car car4 = car3;

        Car car5 = (Car) car1.clone();


        System.out.println(car1.equals(car2));
        System.out.println(car4.equals(car3));
        System.out.println(car1 == car2);
        System.out.println(car5.model.equals(car1.model));

        System.out.println(car1.getClass());

        System.out.println(car1.toString());

    }
}
