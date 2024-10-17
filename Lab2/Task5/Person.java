package Lab2.Task5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.pet = null;
    }

    public void assignPet(Animal pet){
        this.pet = pet;
    }
    public void removePet(){
        this.pet = null;
    }
    public boolean hasPet(){
        return this.pet != null;
    }

    public abstract String getOccupation();

    @Override
    public String toString(){
        return name + ", " + age + " y.o. " + (hasPet()? " owns a " + pet : "has no pet ");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } else if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name) && Objects.equals(pet, person.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pet);
    }
}
