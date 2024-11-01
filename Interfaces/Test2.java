package Interfaces;

public class Test2 {
    public static void main(String[] args) {
        /*
        Класс Book и класс Journal связаны тем, что они реализуют интерфейс Printable.
        Поэтому мы динамически в программе можем создавать объекты Printable как экземпляры обоих классов
         */
        Printable printable = new Book("Journey to ICPC", "Daryn Kenes");
        printable.print();
        printable = new Journal("Forbes");
        printable.print();
        /*
        И если мы хотим обратиться к методам класса Journal, которые определены не в интерфейсе Printable,
        а в самом классе Journal, то нам надо явным образом выполнить преобразование типов: ((Journal)p).getName();
         */
        String name = ((Journal)printable).getName();
        System.out.println(name);

        printable.sayHello(); // вызов дефолт метода из интерфейса
        Printable.read(); // Мы обращаемся прямо к интерфейсу, а не к обьекту который мы создали

    }
}
