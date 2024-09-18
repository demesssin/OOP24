package Encapsul;

public class Encap2 {
    public static void main(String[] args){
        Person2 person1 = new Person2();
        person1.setName("Abzal");
        person1.setAge(48);
        System.out.println("Вывели значение в main методе: " + person1.getName() + " " + person1.getAge());
        person1.speak();
    }
}
class Person2{
    private String name;    // Тут мы добавили приватный модификатор, что бы не было конфликта между нами
                            // И пользователем, теперь пользователь не имеет доступа к полям в Person
    private int age;

    public void setName(String userName){
        name = userName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        age = userAge;
    }
    public int getAge(){
        return age;
    }

    void speak(){
        for (int i = 0; i < 4; i++){
            System.out.println(name + " " + age);
        }
    }
}

