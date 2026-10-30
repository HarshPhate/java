package StreamApi;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {

    public static void main(String[] args) {
//        List<Integer> lis = Arrays.asList(1,2,4,5,6,7,8);
//
//        List<Integer> l1 = lis.stream().filter(i -> i >2).collect(Collectors.toList());
//
//        System.out.println( l1);

        Stream<Object> empty =Stream.empty();

        String nams[] = {"ncv", "cnirnvc", "bcr"};

        Stream<String> nam = Stream.of(nams);
        nam.forEach(r -> {
            System.out.println(r);
        });

        IntStream stream = Arrays.stream(new int[]{1,2,4,5,6});
        stream.forEach(r -> {
            System.out.println(r);
        });

        List<String> str = Arrays.asList("jncjfn","jjncn","bcjc");

        List<String> l11 = str.stream().filter(i -> i.startsWith("j")).collect(Collectors.toList());

        System.out.println(l11);


        List<Integer> lis = Arrays.asList(1,2,4,5,6,7,8);

        List<Integer> l1 = lis.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(l1);

        l1.forEach(r -> System.out.println(r));

        lis.stream().forEach(System.out::println);


        lis.stream().sorted().forEach(System.out::println);



    }

}


