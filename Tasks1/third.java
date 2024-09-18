package Tasks1;

import java.util.Scanner;

public class third {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int points = scan.nextInt();
        if (points > 0 && points <= 29){
            System.out.println("F");
        } else if (points >= 30 && points <= 49) {
            System.out.println("FX");
        } else if (points >= 50 && points <= 54) {
            System.out.println("D");
        } else if (points >= 55 && points <= 59) {
            System.out.println("D+");
        } else if (points >= 60 && points <= 64) {
            System.out.println("C-");
        } else if (points >= 65 && points <= 69) {
            System.out.println("C");
        } else if (points >= 70 && points <= 74) {
            System.out.println("C+");
        } else if (points >= 75 && points <= 79) {
            System.out.println("B-");
        } else if (points >= 80 && points <= 84) {
            System.out.println("B");
        } else if (points >= 85 && points <= 89) {
            System.out.println("B+");
        } else if (points >= 90 && points <= 94) {
            System.out.println("A-");
        } else if (points >= 95 && points <= 100) {
            System.out.println("A");
        } else {
            System.out.println("You typed unacceptable point!");
        }
    }
}
