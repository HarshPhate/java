package in.My.file;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String filename = "java.txt";
        try(FileWriter writer = new FileWriter(filename)){   //this is called try with resource;

            writer.write("I am writing new write");
            writer.flush();
            System.out.println("write is successsfull ");
        }catch(IOException ex){
            System.out.printf("%s ", ex);

        }
    }
}
