package in.filterandreduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter
{
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango","ccherry", "date");
        System.out.println(fruits.size());
        System.out.println("normal");
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("Using fruits using streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("Using fruits using filter streams");

        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }

}
