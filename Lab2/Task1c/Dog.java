package Lab2.Task1c;

import java.util.Objects;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public void setBreed(String someBreed){
        breed = someBreed;
    }
    public String getBreed(){
        return breed;
    }

    @Override
    public String toString(){
        return "It's dog " + getName() + ", he's breed: " + getBreed() + ", he's age " + getAge();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            // Сначала вызывается метод equals() из класса Animal, который проверяет имя и возраст собак.
            return false;
        }
        Dog d1 = (Dog) obj;
        // Если имя и возраст совпадают, программа сравнивает породу с помощью Objects.equals(breed, d1.breed).
        // Если породы одинаковы, программа говорит: "Да, это одинаковые собаки!" и возвращает true.
        return Objects.equals(breed, d1.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }
}
