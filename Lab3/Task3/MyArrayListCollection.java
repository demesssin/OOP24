package Lab3.Task3;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayListCollection<T> implements MyCollection<T>{
    private ArrayList<T> collection;
    public MyArrayListCollection(){
        this.collection = new ArrayList<>();
    }

    @Override
    public boolean add(T element) {
        return collection.add(element);
    }

    @Override
    public boolean remove(T element) {
        return collection.remove(element);
    }
    @Override
    public boolean contains(T element){
        return collection.contains(element);
    }
    @Override
    public int size(){
        return collection.size();
    }
    @Override
    public boolean isEmpty(){
        return collection.isEmpty();
    }
    public Iterator<T> iterator(){
        return collection.iterator();
    }
}
