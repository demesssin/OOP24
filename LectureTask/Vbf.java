package LectureTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Vbf {
    public static void main(String[] args) {
        String filename = "examplefile.txt";
        File file = new File(filename);

        try {
            if (file.createNewFile()) {
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("Это пример текста в созданном файле");
                }
            } else {
                System.out.println("Файл '" + filename + "' уже существует.");
            }
            
        // file.delete();
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл не найден. " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
