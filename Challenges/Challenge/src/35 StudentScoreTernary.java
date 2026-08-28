import java.util.Scanner;

class StudentScoreTernary {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("enter student marks :");
         int marks = input.nextInt();

         String category = marks > 80 ? "High" : (marks > 50 ? "medium" : "low");

         System.out.print("Your catyegory is "+ category);

     }
}
