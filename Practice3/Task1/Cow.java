package Practice3.Task1;

public class Cow extends Animal {
    private int cowWeight;

    public Cow(){
        super();
        System.out.println("Cow constructor");
        cowWeight = 0;
    }

    public Cow(String name, int cowWeight){
        super(name);
        this.cowWeight = cowWeight;
        System.out.println("Cow constructor with name and its weight " + name + ", " + cowWeight);
    }
    public void setCowWeight(int someWeight){
        cowWeight = someWeight;
    }
    public int getCowWeight(){
        return cowWeight;
    }
}
