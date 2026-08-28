package challenge108;

import java.util.List;

public class filterandreduce {
    public static void main(String[] args) {
        List<String> str = List.of("Harsijvnjgbrkjgjnh", "Hart", "Kavjjhbbrfnjdjri", "chcmdk");

       String result = str.stream()
                .filter(name -> name.length() >= 10)
                .reduce("", (a,b)-> a+ " "+ b);

        System.out.println(result);
    }

}
