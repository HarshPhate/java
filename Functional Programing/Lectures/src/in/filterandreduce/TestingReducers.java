package in.filterandreduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReducers {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5);

        int sum =0 ;

        for(Integer num : number){
            sum += num;
        }
        System.out.println(sum);

        int newsum = number.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2 ;
            }
        });
        System.out.printf("\n sum using reduces :%d", newsum);

        int newsum2 = number.stream().reduce(0, (a,b) -> a+b);
        System.out.printf("\n sum using reduces :%d", newsum2);

int max = number.stream().reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);
        System.out.printf("\n max using reduces :%d", max);

    }

}
