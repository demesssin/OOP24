package JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args)  {
        Scanner scan2 = new Scanner(System.in);
        String filename = scan2.nextLine();
        File path = new File(filename);

        try (Scanner scan = new Scanner(path)){ // cпособ try with resources
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }

    }
}
