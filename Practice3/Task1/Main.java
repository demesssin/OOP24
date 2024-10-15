package Practice3.Task1;

public class Main {
    public static void main(String[] args) {
        Animal myanimal = new Animal("P. Diddy");
        System.out.println(myanimal.getName());

        Cow c1 = new Cow();

        Cow c2 = new Cow("Mai-mai",189);
        c2.setCowWeight(500);
        System.out.println(c2.getName() + " " + c2.getCowWeight());

        Dog d1 = new Dog("Aqtos");
        System.out.println(d1.getName() + " say: " + d1.makesound());

        Cat ct1 = new Cat("Boris");
        System.out.println(ct1.getName() + " say: " + ct1.makesound());

    }
}
