package Lab2.Task1a;

public class Main {
    public static void main(String[] args) {
        Sphere sph1 = new Sphere(3.0);
        Cylinder cyl1 = new Cylinder(6.0, 3.5);
        Cube cub1 = new Cube(8.5);
        System.out.println("Surface area for cube: " + cub1.surfaceArea() + ", volume for the cube: " + cub1.volume());
        System.out.println("Surface area for the cylinder: " + cyl1.surfaceArea() + ", volume for the cylinder: " + cyl1.volume());
        System.out.println("Surface area for the sphere: " + sph1.surfaceArea() + ", volume for the sphere: " + sph1.volume());
    }
}
