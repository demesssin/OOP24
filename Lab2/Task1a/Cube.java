package Lab2.Task1a;

public class Cube extends Shape3D {

    private double rebro;

    public Cube(double rebro){
        this.rebro = rebro;
    }

    @Override
    public double volume() {
        return rebro * rebro * rebro;
    }

    @Override
    public double surfaceArea() {
        return 6 * rebro * rebro;
    }
}
