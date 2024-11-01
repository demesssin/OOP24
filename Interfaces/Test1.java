package Interfaces;

public class Test1 {
    public static void main(String[] args) {
        Book b1 = new Book("Abai Joly", "Mukhtar Auezov");
        b1.print();

        // Printable pr1 = new Printable();  Мы не можем создать напрямую объекты интерфейсов
        // pr1.print();
        b1.sayHello();
    }
}
