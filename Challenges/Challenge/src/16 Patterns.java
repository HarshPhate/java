package PACKAGE_NAME;

import java.util.Scanner;

class Patterns {


    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Eneter number of column :");
        int col = input.nextInt();
        System.out.print("Eneter number of rows :");
        int rows = input.nextInt();

        reversepatern(col,rows);
        halftranglee(col,rows);
        mirrorhalftrangle(col,rows);

    }
    public static void halftranglee(int col, int row){
        for(int i = 0; i<=row; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
//                System.out.print(i);
//                System.out.print(j);

            }
            System.out.println();
        }
    }


    public static void reversepatern(int col, int row){


        for(int i= 0; i<row; i++){
            for(int j=i; j<col; j++){
            System.out.print("*");
//            System.out.print(i);
//            System.out.print(j);

            }
                System.out.println("");
        }
    }


    public static void mirrorhalftrangle(int col, int row){

        for(int i=0; i<=row; i++){
                for(int c=i ; c<row; c++){
                    System.out.print(" ");
                }
            for(int j=0; j<=i; j++){

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
