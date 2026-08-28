package in.TryCatch87;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator ");
        System.out.println("Enter first lator");
        int first = input.nextInt();
        System.out.println("Enter second lator");
        int Sec = input.nextInt();


        try {
            int result = first / Sec;
            System.out.printf("%d",result);
        }catch(ArithmeticException exception){


            if(exception.getMessage().equals("/ by zero")){
                System.out.println("divided by zero, enter valid values");
            }else{
                throw  exception;
            }
        }
    }



}
