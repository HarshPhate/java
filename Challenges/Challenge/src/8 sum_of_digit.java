import java.util.Scanner;

class sum_of_digit {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a multi digit number :");
        int num = input.nextInt();

        digitsum(num);



    }

    public static void digitsum(int num){
    int sum = 0,rem = 0;

        while(num > 0){
            rem += num %10 ;
            num  = num/10;
            sum = rem;
        }
        System.out.print(sum);
    }
}
