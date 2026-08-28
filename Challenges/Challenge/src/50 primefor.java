import java.util.Scanner;

class primefor {
     public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("enter anumber :");
int num = input.nextInt();

      boolean result = isprime(num);
      if(result){
           System.out.print(num +" this no prime");

      }else {
           System.out.print(num + "this no is not prime");
      }
     }

     public static boolean isprime(int num) {
          for(int i=2; i< num ; i++){
               if(num % i == 0){
                    return false;
               }
          }
          return true;
     }
}
