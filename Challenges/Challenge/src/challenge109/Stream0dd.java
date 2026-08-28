package challenge109;

import java.util.List;

public class Stream0dd {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,5,67,8,5);

        num.stream().filter(odd -> odd % 2 == 1)
                .forEach(odd -> System.out.println(odd));

  }
}
