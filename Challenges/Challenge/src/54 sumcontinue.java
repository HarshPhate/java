import java.util.Scanner;

class sumcontinue {
     public static void main(String[] args) {
         int[] arr = arrayutility.inputarray();

         int sum =0;

         for(int ele : arr){
             if(ele < 0){
                 continue;
             }
             sum += ele;
         }

         System.out.print(sum);
     }
}
