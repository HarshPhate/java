package challenge106;

import java.util.function.BinaryOperator;

public class LamdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> Multi = (a,b) -> a*b;

       int result =  Multi.apply(4,5);

        System.out.println(result);

    }
}
