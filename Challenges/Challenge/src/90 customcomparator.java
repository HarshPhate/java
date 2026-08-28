import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class customcomparator {
     public static void main(String[] args) {
       List<String> arr = Arrays.asList("Hello", "Harsh", "KKakode");

         System.out.println(arr);
         sortInDesending(arr);
         System.out.println(arr);

     }


     public static void sortInDesending(List<String> stringList){

//         Collections.sort(stringList);

         Collections.sort(stringList, new Comparator<String>() {
             @Override
             public int compare(String o1, String o2) {
                 if(o1.equals(o2)){
                     return 0;
                 }else if(o1.charAt(0) > o2.charAt(0)){
                     return 1;
                 }else{
                     return -1;
                 }
             }
         });
     }
}
