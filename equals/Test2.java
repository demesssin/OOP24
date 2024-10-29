package equals;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        Contact contact3 = new Contact(55, "Assylzhan", "+7708989898");
        Contact contact4 = new Contact(55, "Assylzhan", "+7708989898");

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(contact3);
        contacts.add(contact4);

        System.out.println(contact3.equals(contact4));

    }
}
