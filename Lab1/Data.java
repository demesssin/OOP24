package Lab1;

public class Data{
    private double sum;
    private double max;
    private int cnt;

    public Data(){
        sum = 0.0;
        max = Double.MIN_VALUE;
        cnt = 0;
    }
    public void add(double value){
        sum = sum + value;
        if (value > max){
            max = value;
        }
        cnt++;
    }
    public double getAverage(){
        if (cnt == 0){
            return 0.0;
        }
        return sum / cnt;
    }
    public double getMax(){
        return max;
    }
}

