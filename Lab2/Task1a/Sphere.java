package Lab2.Task1a;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (double) 4 /3 * (Math.PI * radius * radius * radius);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
