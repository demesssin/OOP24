package Interfaces;

public class Test3 {
    public static void main(String[] args) {
        Calculatable c = new Calculate();
        System.out.println(c.sum(1,3,9));
        System.out.println(c.sum(55, 78));
        /*
        Тут мы вызываем приватные методы из интерфейса Calculatable
         */
    }
}
