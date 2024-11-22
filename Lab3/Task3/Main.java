package Lab3.Task3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyArrayListCollection<>();

        myCollection.add("Apple");
        myCollection.add("Pen");
        myCollection.add("Pineapple");

        System.out.println(myCollection.size());

        System.out.println("Сейчас мы будем перебирать наши элементы с помощью итератора");
        Iterator<String> iterator = myCollection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(myCollection.isEmpty());

        myCollection.remove("Apple");
        myCollection.remove("Pen");
        System.out.println(myCollection.size());
        System.out.println(myCollection.contains("Pineapple"));
    }
}
