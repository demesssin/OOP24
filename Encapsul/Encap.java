package Encapsul;

public class Encap {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Baktygali";
        person1.age = 152;
        person1.speak();
    }
}
class Person{
    String name;        // Это пример неправильного кода, здесь нет инкапсуляции
                        // Поэтому при любых наших изменениях в классе Персон пользователь получает ошибку
    int age;
    void speak(){
        for (int i = 0; i < 3; i++){
            System.out.println(name + " " + age);
        }
}

}
