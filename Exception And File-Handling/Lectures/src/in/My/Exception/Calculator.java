package in.My.Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       a();
    }

    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        d();
    }
    private static void d(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator ");
        System.out.println("Enter first lator");
        int first = input.nextInt();
        System.out.println("Enter second lator");

        int Sec = input.nextInt();

        try {

//            int arr[] = new int[5];
//
//            arr[5] = 5;
//            arr[6]= 7;
//            System.out.println(arr[6]);
            int result = first / Sec;
            System.out.printf("%d",result);
        }catch(ArithmeticException exception){
            System.out.printf("%s, enter valid values",exception.getMessage());
        }catch(Throwable th){
            System.out.println("General exception");
            throw th;
        } finally {
            System.out.println("I am Finally");
        }
    }
}
