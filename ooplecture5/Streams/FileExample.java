package ooplecture5.Streams;
import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Создаем FileInputStream для чтения байтов из файла "in.dat"
            //FileInputStream fis = new FileInputStream("in.txt");

            // Создаем FileOutputStream для записи байтов в файл "out.dat"
            //FileOutputStream fos = new FileOutputStream("in.txt");

            // Создаем FileReader для чтения символов из файла "in.dat"
            //FileReader fr = new FileReader("in.txt");

            // Создаем FileWriter для записи символов в файл "out.dat"
            //FileWriter fw = new FileWriter("in.txt");

            BufferedReader br = new BufferedReader(new FileReader("in.txt"));
            String line = br.readLine();
            while (line != null){
                System.out.println("Read a line: " + line);
                line = br.readLine();
            }
            br.close();

            /*fis.close();
            fos.close();
            fr.close();
            fw.close();
            System.out.println(fr);
            System.out.println(fis);

             */

        } catch (FileNotFoundException fe){
            System.out.println("File not found");
        } catch (IOException ioe){
            System.out.println("Can't read from file");
        }
    }
}
