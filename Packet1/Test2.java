package Packet1;

public class Test2 {
    public static void main(String[] args){
        Person person = new Person();
        person.name = "Nurik";

        // Это был пример приватного модификатора
        // Как мы видим мы не можем использовать или вызывать переменную Name2 из класса Person2
        // Потому что из за модификатора private мы не можем использовать её ВНЕ класса где он инициализирован
    }
}
