package Lab2.Task5;

import java.util.List;
import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> people = new Vector<>();
    public void addPerson(Person person){
        people.add(person);
    }
    public void removePerson(Person person){
        people.remove(person);
    }

    public List<Person> findPeopleWithPets(){
        List<Person> peopleWithPets = new Vector<>();
        for (Person person : people){
            if (person.hasPet()){
                peopleWithPets.add(person);
            }
        }
        return peopleWithPets;
    }
    public List<Person> findPeopleWithoutPets(){
        List<Person> peopleWithoutPets = new Vector<>();
        for (Person person : people){
            if (!person.hasPet()){
                peopleWithoutPets.add(person);
            }
        }
        return peopleWithoutPets;
    }
    public void printDetails(){
        for (Person person : people){
            System.out.println(person);
        }
    }
}
