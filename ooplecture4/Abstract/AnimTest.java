package ooplecture4.Abstract;

public class AnimTest {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal();
        // Представь, что абстрактный класс — это как чертёж.
        // Ты не можешь играть с чертежом, как с настоящей машиной.
        // Это просто план. Нельзя создать объект из абстрактного класса.

        // Можно создать переменную абстрактного типа
        Animal myPet = new Dog();
        myPet.makeSound();
    }
}
