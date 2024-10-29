package Exceptions.Checked;

import java.util.Scanner;

public class ScannerExTest {
    public static void main(String[] args) throws ScannerEx { // здесь мы также обрабатываем через throw наше исключение
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0){
                throw new ScannerEx("Тебя встречает наш новый экспешн, ты ввел невалидное значение");
                // Как видим, наше исключение работает
            }
        }
    }
}
