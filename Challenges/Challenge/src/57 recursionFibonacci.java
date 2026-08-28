import java.util.Scanner;

class recursionFibonacci {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("enter a number you wnat to positon :");
         int count = input.nextInt();

         for(int i=1; i<= count; i++){
             System.out.println(fibonacci(i) + "");
         }
     }

     public static int fibonacci(int pos){
         if(pos == 1){
             return 0;
         }
         if(pos == 2){
             return 1;
         }

         return fibonacci(pos -1) + fibonacci(pos-2);
     }
}
