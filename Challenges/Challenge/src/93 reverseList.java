import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class reverseList {
     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,2,3,4,45,6);

//         System.out.println(list);
//         Collections.reverse(list);
//         System.out.println(list);
         System.out.println(list);
         rev(list);
         System.out.println(list);
     }


     public static void rev(List<Integer> list){

         for (int i = 0; i < list.size()/ 2; i++) {

             Collections.swap(list, i, list.size()-i-1);


         }
     }
}
