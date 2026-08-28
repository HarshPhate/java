import java.util.Scanner;

class Palindrome {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = input.nextInt();

        int rev = palin(num);

        if(num == rev){
            System.out.print(num+" is a palindrome " +rev);
        }else{
            System.out.print(num+" is not a palindrome " +rev);

        }


    }

    public static int palin(int num){

        int rem,rev=0;
        while(num>0){
           rem = num% 10;
           rev =rev*10 +rem;
           num = num/10;
        }
        return rev;
    }
}
