package equals;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact(124, "Vasya", "+77073667777");
        Contact contact2 = new Contact(124, "Vasya", "+77073667777");

        System.out.println(contact1.hashCode());
        System.out.println(contact2.hashCode());

        System.out.println(contact1.equals(contact2));

        System.out.println(contact1.toString());
        System.out.println(contact2.toString());

        System.out.println(contact1.equals(contact2));
    }
}
