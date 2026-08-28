import java.util.Scanner;

class factorial {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number :");

        int num = input.nextInt();

    factto(num);

    }

    public static void factto(int num){

        int i = 1;
        long fact = 1;


        while( i <= num){
            fact =fact * i;
            i++;
        }

        System.out.println("Factorial of " + num + " is: " + fact);    }
}
