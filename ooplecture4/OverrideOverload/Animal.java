package ooplecture4.OverrideOverload;

public class Animal {
    String name;
    int weight;
    public Animal(){

    }
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String voice(int n){
        String res = "";
        for (int i = 0; i < n; i++){
            res += voice() + " ";
        }
        return res;
    }

    public String voice(){
        return "Not Defined";
    }
}

