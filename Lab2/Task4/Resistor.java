package Lab2.Task4;

public class Resistor extends Circuit{
    private double resistance;
    private double potentialDiff;

    public Resistor(double resistance){
        this.resistance = resistance;
    }

    @Override
    public double getResistance(){
        return resistance;
    }

    @Override
    public double getPotentialDiff(){
        return potentialDiff;
    }

    @Override
    public void applyPotentialDiff(double V){
        this.potentialDiff = V;
    }


    public void setPotentialDiff(double V){
        this.potentialDiff = V;
    }
}
