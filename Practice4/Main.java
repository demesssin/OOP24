package Practice4;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();
        Scanner scan = new Scanner(System.in);

        Shape circle = new Circle(1, Color.RED, 10);
        Shape rectangle = new Rectangle(2, Color.BLACK, 20, 30);
        Shape triangle = new Triangle(3, Color.GREEN, 5, 19);

        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        for (Shape figures : shapes){
            figures.draw();
        }

        System.out.println("Enter shape to draw: Circle, Rectangle, or Triangle");
        String choice = scan.nextLine();

        switch (choice) {
            case "Circle":
                drawCircle(10);
                break;
            case "Rectangle":
                drawRectangle(5, 10);
                break;
            case "Triangle":
                drawTriangle(5, 3);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scan.close();
    }

    public static void drawCircle(int radius) {
        int centerX = radius;
        int centerY = radius;
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                int dx = centerX - i;
                int dy = centerY - j;
                if (dx * dx + dy * dy <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int height, int base) {
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
