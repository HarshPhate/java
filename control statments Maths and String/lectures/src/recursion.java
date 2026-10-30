import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number :");
        int num = input.nextInt();

        long result = fact(num);
        System.out.print(result);
    }

    public static long fact(int num){
      if(num== 1){
          return 1;
      }

      return num * fact(num-1);
    };


    public static long factitrate(int num){
     long fact = 1;

     for(int i=1; i<=num; i++){
         fact *= i;
     }
     return fact;
    }

}
