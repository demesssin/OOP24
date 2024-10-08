package ooplecture4.Abstract;

public class CarTest {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        PetrolCar bmw = new PetrolCar();

        tesla.hasWheels();
        tesla.engineSound();

        bmw.hasWheels();
        bmw.engineSound();
    }
}
