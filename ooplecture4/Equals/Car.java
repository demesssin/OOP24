package ooplecture4.Equals;

import jdk.jfr.Percentage;

public class Car implements Cloneable {
    String model;

    public Car(String model){
        this.model = model;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Hello, it was the: " + model;
    }
}
