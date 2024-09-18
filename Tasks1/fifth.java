package Tasks1;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Type the initial balance: ");
        int init = scan.nextInt();
        System.out.println("Type the interest: ");
        int percent = scan.nextInt();

        int newbalance = init + (init * percent / 100);

        System.out.println("New balance after adding: " + newbalance);
    }
}
