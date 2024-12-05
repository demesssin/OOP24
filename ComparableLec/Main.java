package ComparableLec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<Car>();

        list.add(new Car("eqwe", 2021));
        list.add(new Car("kfdfmkd", 2035));
        list.add(new Car("lamar", 2842));
        list.add(new Car("drake", 2010));
        list.add(new Car("yrban", 1998));

        //System.out.println(list.toString());
        // Collections.sort(list, new SortByYear());
        //Collections.sort(list, new SortByModel());
        Collections.sort(list);

        for(Car car : list){
            System.out.println(car.getModel() + " | " + car.getYear());
        }
    }
}
