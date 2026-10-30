import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] arg){

        Scanner input = new Scanner (System.in);

        System.out.print("enter first number :");
        int num1= input.nextInt();

        System.out.print("enter second number :");
        int num2= input.nextInt();


        int greatestnum = num1 > num2 ? num1 : num2 ;

        System.out.println(greatestnum + " is a greatest number");
}
    }
