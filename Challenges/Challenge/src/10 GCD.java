//GCD means gratest common divisor

import java.util.Scanner;

class GCD {
public static void main(String[] arg){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a first num :");
    int first = input.nextInt();
    System.out.print("enter a second num :");
    int sec = input.nextInt();

    int result = gcd(first, sec);

    System.out.print("result :"+ result);

}

public static int gcd(int first ,int sec){
    int gcd = 1;
int i= 2;
int leas = least(first, sec);
while(i<= leas){
    if(first % i ==0 && sec % i == 0){
        gcd = i;
    }
    i++;
}
return gcd;
}

public static int least(int num1, int num2){
    if(num1 < num2) {

        return num1;
    }else{
        return num2;
    }
}

}
