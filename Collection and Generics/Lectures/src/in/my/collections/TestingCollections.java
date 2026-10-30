package in.my.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();

        nums.add(56);
        nums.add(5);
        nums.add(55);
        nums.add(57);
        nums.add(59);

        Utilitu.print(nums);

        Collections.sort(nums);
        Utilitu.print(nums);

        Collections.reverse(nums);
        Utilitu.print(nums);

        Collections.shuffle(nums);
        Utilitu.print(nums);


        System.out.println( Collections.max(nums));

//
//        List<Integer> unmodified = Collections.unmodifiableList(nums);
//
//        unmodified.add(5);
//


    }
}
