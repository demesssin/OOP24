package Interfaces;

public class Test4 {
    public static void main(String[] args) {
        WaterPipe w1 = new WaterPipe();
        w1.printState(Stateable.OPEN);
        w1.printState(Stateable.CLOSED);
        w1.printState(225554);
    }
}
