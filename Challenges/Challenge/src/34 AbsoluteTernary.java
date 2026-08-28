import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number :");
        int num = input.nextInt();

        int result = num >=0 ? num : -num ;

        System.out.print(result);
    }
}
