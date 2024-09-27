package Lab1;

public class Temperature {
    private double value;
    private char scale;

    public Temperature(){
        this.value = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value){
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale){
        this.value = 0.0;
        this.scale = scale;
    }

    public Temperature(double value, char scale){
        this.value = value;
        this.scale = scale;
    }
    public double getValue(){
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
    public char getScale(){
        return scale;
    }
    public void setScale(){
        this.scale = scale;
    }

    public double toCelsius(){
        if (scale == 'F'){
            return 5 * (value - 32) / 9;
        }
        return value;
    }
    public double toFar(){
        if (scale == 'C'){
            return 9 * (value / 5) + 32;
        }
        return value;
    }
}
