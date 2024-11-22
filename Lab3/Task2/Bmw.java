package Lab3.Task2;

public class Bmw implements CarPower{
    String model;
    public Bmw(String model){
        this.model = model;
    }

    @Override
    public void engineSound() {
        System.out.println("Sound of the engine of BMW " + model + " is very loud and frisky");
    }

    @Override
    public void engineHorsePower(int x) {
        System.out.println("Power of the BMW " + model + " is " + x + " horse power");
    }

}
