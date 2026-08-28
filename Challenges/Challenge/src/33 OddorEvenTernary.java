import java.util.Scanner;

class givenNo_OddorEven {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number :");
        int num = input.nextInt();

        String result = num % 2 == 0 ? "even" : "odd";
        System.out.println("The number is " + result);
    }
}
