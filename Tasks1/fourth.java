package Tasks1;

import java.util.Scanner;
public class fourth {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the parametres of equation: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double disc = Math.pow(b,2) - 4 * a * c;
        if (disc > 0){
            double x1 = (-b + Math.sqrt(disc)) / 2 * a;
            double x2 = (-b - Math.sqrt(disc)) / 2 * a;
            System.out.println("First root: " + x1);
            System.out.println("Second root: " +  x2);
        } else if (disc == 0) {
            int lonelyx = - b / 2 * a;
            System.out.println("Equation have one root: " + lonelyx);
        } else {
            System.out.println("D is negative, so equation don't have roots");
        }

    }
}
