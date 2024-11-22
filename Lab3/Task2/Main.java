package Lab3.Task2;

public class Main {
    public static void main(String[] args) {
        Bmw c1 = new Bmw("M5 F90");
        Tesla c2 = new Tesla("Model X Long Range");

        c1.engineSound();
        c2.engineSound();

        c1.engineHorsePower(650);
        c2.engineHorsePower(680);

    }
}
