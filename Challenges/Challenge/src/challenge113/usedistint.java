package challenge113;

import java.util.List;
import java.util.stream.Collectors;

public class usedistint {
    public static void main(String[] args) {
        List<Integer>  number = List.of(1,2,3,4,3,1,4,5,6);

        List<Integer> newlist = number.stream().distinct().collect(Collectors.toList());

        System.out.println(newlist);

    }
}
