import java.util.Scanner;

class exitbreak {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         while(true){
             System.out.print("Enter a command :");
         String command = input.next();
         if(command.equals("exit") ){          //command.equalsignorcase("exit")
             break;
         }
         }
         System.out.print("Successfully exit");
     }
}
