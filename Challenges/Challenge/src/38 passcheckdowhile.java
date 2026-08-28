import java.util.Scanner;

class passcheckdowhile {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         int pass;
         do{
             System.out.print("enter a 3-digit correct password :");
              pass = input.nextInt();
         }while(pass != 123);

         System.out.print("pass is correct " + pass);
     }
}
