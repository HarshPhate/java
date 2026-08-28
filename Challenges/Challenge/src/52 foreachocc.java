import java.util.Scanner;

class foreachocc {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int[] arr = arrayutility.inputarray();
         System.out.print("enter a number :");
         int num = input.nextInt();

         int result =0;
         for(int ele : arr){
             if(ele == num){
                 result ++;
             }
         }
         System.out.print(result);
     }
}
