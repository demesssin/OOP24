package Lab2.Task4;

public class Main {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);
        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circ1 = new Parallel(h, f);
        double T1 = circ1.getResistance();
        Circuit circ2 = new Series(a, f);
        double T2 = circ2.getResistance();
        Circuit circ3 = new Series(a, b);
        circ3.applyPotentialDiff(6.0);
        double T3 = circ3.getPower();


        System.out.println(a.getResistance());
        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);
    }
}
