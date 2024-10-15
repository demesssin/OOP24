package Lab2.Task1c;
import java.util.Objects;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String someName){
        name = someName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int someAge){
        age = someAge;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "It's some myphic animal with name " + getName() + " and age " + getAge();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            // Когда ты вызываешь equals() на одном объекте, программа сначала проверяет, является ли он тем же объектом,
            // что и другой (с помощью this == obj).
            // Это как если бы ты посмотрел на одного мишку и спросил: "Это тот же самый мишка, что и раньше?".
            // Если это один и тот же объект, программа сразу возвращает true, потому что они точно одинаковы.
            return true;
        }
        else if (obj == null || getClass() != obj.getClass()){
            //Если это не тот же объект, программа проверяет, является ли другой объект тем же типом, что и первый
            // (с помощью getClass() != obj.getClass()).
            // Если другой объект — не животное, например, машина,
            // то equals() сразу возвращает false, потому что животное не может быть машиной
            return false;
        }
        Animal animal = (Animal) obj;
        return age == animal.age && Objects.equals(name, animal.name) ;
        // Если оба объекта — животные, программа сравнивает их имя и возраст
        // с помощью Objects.equals(name, animal.name) и age == animal.age.
        // Если имя и возраст совпадают, программа говорит: "Да, это одинаковые животные!" и возвращает true.
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    /*
    Представь себе коробку для игрушек, которая позволяет хранить только уникальные игрушки.
    То есть, если у тебя уже есть один плюшевый мишка, ты не можешь положить в коробку второго такого же мишку.
    Вот так работает HashSet.
    Когда ты добавляешь объект (например, собаку) в HashSet, HashSet:
    Сначала использует hashCode(), чтобы найти "место" для объекта в своей "коробке".
    Затем использует equals(), чтобы проверить, есть ли уже в коробке такой же объект.
    Если объект с такими же полями (имя, возраст, порода) уже существует, он не добавляет дубликат.
     */
}
