package challenge114;

import java.util.List;
import java.util.stream.Collectors;

public class TestingSort {
    public static void main(String[] args) {
        List<employe>  employe = List.of(
               new employe("Harsh", 50000),
               new employe("rjrj", 5000),
               new employe("nfrn", 500),
               new employe("frrej", 50)
        );

       employe.stream()
                .sorted((emp1,emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);


    }
}
