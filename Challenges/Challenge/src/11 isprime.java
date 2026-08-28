import java.util.Scanner;

class isprime{
    public static void main(String[] arg){
        Scanner input = new  Scanner(System.in);
        System.out.print("enter a number :");
        int num = input.nextInt();

       boolean p =  isprimes(num);
if(p){
    System.out.print("No. is true");
}
else{
    System.out.print("No. is not true");
}


    }

    public static boolean isprimes(int num) {
int i =2;

while(i< num){

    if(num % i == 0){
        return false;
    }

i++;
}
        return true;
    }
}
