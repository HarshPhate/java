import java.util.Scanner;

class Bitwiseand {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
//        System.out.println("enter first number : ");
//        int first = input.nextInt();
//        3.bn/ System.out.println("enter Second number : ");
//        int Second = input.nextInt();
//
//        int result = first & Second;
//        System.out.print("result is :"+ result);
        System.out.println("enter number");
        int num = input.nextInt();

        int result = num << 4;
//        left shift operator
//        int result = num >> 1;       //reight shift operator
        System.out.print(result);

    }
}
