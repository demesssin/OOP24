package Lab2.Task1b;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Portrait of Dorian Gray", "Oscar Wilde", 1890, 320);
        Dvd d1 = new Dvd("Spider Man", "Sam Raim", 2002, "7.29 Gb");
        Magazine m1 = new Magazine("Forbes 30u30", "Randall Llane", 2011, "Business and luxury life");

        System.out.println(b1.toString());
        System.out.println(d1.toString());
        System.out.println(m1.toString());
    }
}
