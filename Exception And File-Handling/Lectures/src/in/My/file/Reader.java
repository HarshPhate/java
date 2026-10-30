package in.My.file;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String filename = "java.txt";

        try (FileReader reader = new FileReader(filename)){
          int read ;

//          do {
//              read = reader.read();
//              System.out.print((char)read);
//          }while(read != -1);

            while((read = reader.read()) != -1){
                System.out.print((char)read);
            }

        }catch(IOException ex){
            System.out.printf("%s ", ex);

        }
    }
}
