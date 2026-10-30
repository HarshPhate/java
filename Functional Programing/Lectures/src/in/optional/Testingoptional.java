package in.optional;

import java.util.List;
import java.util.Optional;

public class Testingoptional {
    public static void main(String[] args) {
        List<Integer>  number = List.of();

        Optional<Integer> newsum = number.stream().reduce((a,b)-> a+b);

        if(newsum.isPresent()){
            System.out.println(newsum.get());
        }else{
            System.out.println("List is empty");
        }
    }
}
