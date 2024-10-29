package ooplecture5.Streams;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSExample {
    public static void main(String[] args) {
        String data = "New datas about stupid Daryn";
        String data2 = "Again again and again";
        try (FileOutputStream fos = new FileOutputStream("inn.txt")) {
            fos.write(data.getBytes());
            fos.write(data2.getBytes());
            System.out.println("Данные записаны");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println(ioe);
        }
    }
}
