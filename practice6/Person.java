package practice6;

public class Person implements CanHavePizza, Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Someone is eating pizza");
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
