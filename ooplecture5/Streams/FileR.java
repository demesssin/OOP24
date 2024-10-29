package ooplecture5.Streams;
import java.io.FileReader;
import java.io.IOException;

public class FileR {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("in.tx")){
            int character;
            while ((character = fr.read()) != -1){
                System.out.println((char) character);
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
