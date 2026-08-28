import java.util.Scanner;

class Armstrong {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a multiple digit number :");
        int num = input.nextInt();

       int armstrong = arm(num);

        if(num == armstrong){

        System.out.print("yes " +num +" this is a armStrong no is "+ armstrong);
        }
else{

        System.out.print("this is not a arm strong  no " + armstrong);
        }

    }

    public static int arm(int num){
        int rem , arm= 0 ,cub ;
        while(num  >0){
            rem = num % 10 ;
            cub =rem *rem *rem ;
            arm +=rem *rem *rem ;
            System.out.println("power of "+rem +" is " +cub);


             num /= 10;
        }
        return arm;
    }
}
