import java.util.Scanner;

class fibonacci {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a no. :");
        int num = input.nextInt();
        int a=0;
        int b= 1;

        for(int i=0; i<num ; i++){
            int temp =a;
            a= a+b;
            b= temp;

            if(temp<num){

      System.out.println(temp);
            }
        }
    }
}
