package JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args)  {
        Scanner scan1 = new Scanner(System.in);
        String filename = scan1.nextLine();
        File path = new File(filename);

        try (Scanner scan2 = new Scanner(path)){ // cпособ try with resources
            while (scan2.hasNextLine()){
                System.out.println(scan2.nextLine());
            }
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        scan1.close();
    }
}
