package Exceptions.Checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        try {
            readFile(); // Но во всех других методах которые вызывают этот метод (readFile) нам также надо обрабатывать ошибку
        } catch (FileNotFoundException e){
            System.out.println("Обработка исключения в методе main");
        }
    }

    public static void readFile()  throws FileNotFoundException {
        File file = new File("testfsdfsd"); // В таком случае ошибка не пропадает! Тут мы используем throws
        Scanner scan = new Scanner(file);   // В этом методе этот код обработается
        // Код сработает если мы будем искать несуществующий файл!
        // Если искать test то код просто сработает
    }
}
