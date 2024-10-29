package ooplecture5.Streams;
import java.io.*;
import java.io.FileInputStream;

public class FISExample {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("in.txt")){
            int content;
            while ((content = fis.read()) != -1){
                System.out.println((char) content);
            }
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
