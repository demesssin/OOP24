package ooplecture4.Polymorphism;

public class PolyTest {
    public static void main(String[] args){
        Animal myAnimal1 = new Dog();
        myAnimal1.eat();
        Animal myAnimal2 = new Cat();
        myAnimal2.eat();
        //Dog d = new Dog();
        //d.findPedigree();
         // myAnimal1.findPedigree(); пример полиморфизма!
        /*
        Пример как в Все Dog Animal, но не все Animal это Dog
        Я не смог использовать findPedigree потому что его нет в animal
        Ведь мы через Animal наследуем к Dog
        а void eat() есть и там и там
        поэтому у нас получилось запустить void eat()
        если бы было Dog d = new Dog()
        d.findPedigree() у нас бы вышло, так как мы через обьект ссылаемся ТОЛЬКО к классу ДОГ
         */
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myAnimal.eat();
        System.out.println(myAnimal instanceof Animal);
        System.out.println(myDog instanceof Dog);
        System.out.println(myCat instanceof Cat);
        System.out.println(myDog instanceof Animal);
        System.out.println(myCat instanceof Animal);



    }
}
