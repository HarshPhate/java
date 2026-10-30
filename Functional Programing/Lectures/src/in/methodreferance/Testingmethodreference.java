package in.methodreferance;

import java.util.List;

public class Testingmethodreference {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6);

        number.stream()
                .filter(odd -> odd %2 ==1)
                .forEach(num -> System.out.println(num));

    number.stream()
                .filter(odd -> odd %2 ==1)
                .forEach(System.out::println);




        int newsum2 = number.stream().reduce(0, Integer::sum);
        System.out.printf("\n sum using reduces :%d", newsum2);
    }

}
