package Tasks1;

import java.util.Scanner;

public class sixth2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();

        if (reversed.equals(word)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Palindrom emeeeeeeeeees");
        }
    }
}
