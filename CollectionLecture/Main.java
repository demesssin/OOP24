package CollectionLecture;
import java.sql.SQLOutput;
import java.util.Collection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("A"));
        System.out.println(list1.remove("dxf")); // false

        Collection<String> list2 = new ArrayList<String>();
        list2.add("C");
        list2.add("D");
        System.out.println(list1.equals(list2));

        System.out.println(list1);
        list1.clear();
        System.out.println(list1); // сделали массив пустым

        System.out.println(list1.containsAll(list2)); // false потому что нет вообще общих элементов
        System.out.println(list1.retainAll(list2));
    }

}
