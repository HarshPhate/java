import java.util.Scanner;

class findmin {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.print("enter first number :");
        int num1 = input.nextInt();
        System.out.print("enter second number :");
        int num2 = input.nextInt();

        int min = num1 < num2 ? num1 : num2 ;

        System.out.print(min);
    }
}
