package NadiraInterfaces;

public class Main {
    public static void main(String[] args) {
        InfoInterface animal = new Animal("cat", 1);
        Person person = new Person("Ruslan", "154531316451");
        System.out.println(animal.getDescription());
        System.out.println(person.getDescription());

        Calculator c = new Calculator();
        c.add(5, 10);
        c.subtract(19,5);
        c.multiply(58, 45);
        c.divide(5555, 11);

    }

    /*public static void getInfo(InfoInterface infoInterface){
        infoInterface.
    }

     */
}
