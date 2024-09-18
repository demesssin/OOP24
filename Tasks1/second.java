package Tasks1;

import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the length of side a: ");
        int a = scan.nextInt();
        double area = Math.pow(a, 2);
        int perim = a * 4;
        double diag = a * Math.sqrt(2);

        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square: " + perim);
        System.out.println("Diagonal of sqaure: " + diag);
    }
}
