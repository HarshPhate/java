import java.util.Scanner;

class Sum {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number :");
        int first = input.nextInt();
        System.out.print("enter second number :");
        int sec = input.nextInt();

        int sum = first + sec;
        System.out.print("Sum of two number :" +sum);

    }
}
