package Lab1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Data prob = new Data();
        System.out.println("Enter the number('Q' to quit): ");

        while (true){
            String str = scan.nextLine();
            if (str.equals("Q")) {
                break;
            }
            try {
                double value = Double.parseDouble(str);
                prob.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'Q' to quit.");
            }
        }

        System.out.println("Average: " + prob.getAverage());
        System.out.println("Maximum: " + prob.getMax());

        scan.close();
    }
}