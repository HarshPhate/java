import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class countfrequency {
     public static void main(String[] args) {
             List<Integer> list = Arrays.asList(1,2,3,1,1,5,6,6,7);
         System.out.println(Collections.frequency(list,1));
         System.out.println(Collections.frequency(list,6));

     }
}
