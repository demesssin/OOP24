package Lab3.Task3;

public interface MyCollection<T>{
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
    // T[] toArray();
    java.util.Iterator<T> iterator();
}
