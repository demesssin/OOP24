package Tasks1;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your word: ");
        String word = scan.nextLine();
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reversed = reversed + word.charAt(i);
        }
        if (reversed.equals(word)){
            System.out.println("It's palindrome!");
        } else {
            System.out.println("It's not a palindrome!");
        }
    }
}
