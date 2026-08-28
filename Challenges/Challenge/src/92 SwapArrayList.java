import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SwapArrayList {
     public static void main(String[] args) {
         List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
         System.out.println(num);
         swap(num, 1,4);
         System.out.println(num);

     }

     public static void swap(List<Integer> list, int x, int y){

         int swap = list.get(x);

         list.set(x, list.get(y));
         list.set(y,swap);
     }
}
