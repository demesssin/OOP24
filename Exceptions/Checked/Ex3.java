package Exceptions.Checked;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) { //throws IOException мы можем обработать исключение самостоятельно {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                //throw new IOException(); // можно и так, но попробуем с try, catch
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Пользователь ввел что то кроме нуля");
                }
            }
        }
    }
}