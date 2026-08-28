import java.util.Scanner;

class reversedigit {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a multiple digit no. :");
        int num = input.nextInt();

        int rev = reverse(num);

        System.out.print("reverse digit :"+ rev);

    }

    public static int reverse(int num){
int rev =0;


        while(num > 0){
            int rem = num % 10;
            num = num / 10;
             rev = rev*10 + rem;
        }

        return rev;
    }
}
