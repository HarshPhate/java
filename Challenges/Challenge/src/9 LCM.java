import java.util.Scanner;

class LCM {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("eneter first number :");
        int first = input.nextInt();
        System.out.println("eneter second number :");
        int sec = input.nextInt();

        int n = first * sec;
        System.out.println(n);
        int  i=1;

        while( i <= n){
            int  fact = first * i;



            if(fact % sec == 0){
                System.out.println("LCM is: " + fact);
                return ;

            }
            i++;

        }




    }

}
