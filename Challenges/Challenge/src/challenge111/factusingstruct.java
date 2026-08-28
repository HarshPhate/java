package challenge111;

import java.util.Scanner;
import java.util.stream.IntStream;

public class factusingstruct {

    public static void main(String[] args) {
        int num = 9;


        int result = fact(num);
        System.out.println(result);


        IntStream.rangeClosed(2,num)
                .reduce((a,b) -> a*b)
                .ifPresent(System.out::println);
    }



    public static int fact(int num){
        int fact = 1;
        for(int i = 1 ; i<=num; i++){
            fact *= i;
        }

        return fact;
    }
}
