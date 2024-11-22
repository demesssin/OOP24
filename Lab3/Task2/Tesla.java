package Lab3.Task2;

public class Tesla implements CarPower{
    String model;
    public Tesla(String model){
        this.model = model;
    }

    @Override
    public void engineSound() {
        System.out.println("Sound of the Tesla" + model + " is very quiet");
    }

    @Override
    public void engineHorsePower(int x) {
        System.out.println("Power of the Tesla" + model + " is " + x + " horse power");
    }
}
