import java.util.Scanner;

class guessnodowhile {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int numm = 5;
         System.out.print("welcome no gess game :");

        int num;

         do{
         System.out.print("enter a number :");
          num = input.nextInt();

         }while(numm != num);

         System.out.print("correct");

     }

}
