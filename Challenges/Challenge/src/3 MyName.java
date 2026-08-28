//challenge

import java.util.Scanner;

class MyName{
    public static void main(String[] arg){
        Scanner userName = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name =userName.nextLine();
        System.out.println("Welcome "+ name + " to coding club");
    }
}