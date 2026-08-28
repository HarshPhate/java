package challenge107;

import java.util.ArrayList;
import java.util.List;

public class stringStream {
    public static void main(String[] args) {
         List<String> str = List.of("HArsh", "Haard", "shbxhb");

         str.stream().forEach(st -> System.out.println(st)  );
    }
}
