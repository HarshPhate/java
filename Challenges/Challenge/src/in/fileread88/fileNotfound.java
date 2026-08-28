package in.fileread88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileNotfound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a file name :");
        String filename = input.next();


        try(FileReader reader =new FileReader(filename)){
            int read =0;
            do{
                read = reader.read();
                System.out.print((char)read);
            }while(read != -1);
        }catch(FileNotFoundException e){
            System.out.printf("%s this file not found", filename, e.getMessage());
        }
        catch(IOException e){

            System.out.println(e.getMessage());
        }
    }
}
