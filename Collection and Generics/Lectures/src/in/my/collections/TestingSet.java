package in.my.collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>() ;

        System.out.println(names.add("Harsh"));
        System.out.println(names.add("Naresh"));
        System.out.println(names.add("Siddesh"));
        System.out.println(names.add("Harsh"));

//        for(String col : names){
//            System.out.println(col);
//        }
        Utilitu.print(names);
        System.out.println(names.size());
        System.out.println(names.contains("Harsh"));
        System.out.println(names.remove("Harsh"));

        Utilitu.print(names);


    }
}
