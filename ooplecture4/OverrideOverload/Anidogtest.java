package ooplecture4.OverrideOverload;

public class Anidogtest {
    public static void main(String[] args) {
        Animal a1 = new Animal("Aqtos");
        System.out.println(a1.getName());
        System.out.println(a1.voice(5));
        Dog d1 = new Dog();
        System.out.println(d1.voice());
        System.out.println(d1.voice(10));
        d1.findPedigree();

    }
}
