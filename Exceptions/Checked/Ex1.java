package Exceptions.Checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){ // throws FileNotFoundException { // throws говорит что при запуске может выйти такая ошибка
        File file = new File("test");

        try {
            Scanner scan = new Scanner(file); // try говорит что мы можем попытаться запустить этот кусок кода
            System.out.println("После Scanner'a"); // если есть ошибка то кода внутри try не сработает, например этот вывод не появится
            // но если наоборот исключения НЕ БУДЕТ, то этот кусок кода внутри try сработает
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
            // в блоке catch мы ловим сообщение об ошибке, то есть мы обрабатываем ошибку при случае если появится
            // исключение
        }
        System.out.println("После блока try catch");
    }


}
