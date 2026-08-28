import java.util.Scanner;

public class arrayutility {
    public static int[] inputarray(){
        Scanner input = new Scanner(System.in);
        System.out.print("plesase enter the size of array :");
        int size = input.nextInt();
        int[] arr = new int[size];

        int i=0;
        while(i < arr.length){
            System.out.print("eneter array elements " +(i+1)+ ":");
            int ele = input.nextInt();
            arr[i] = ele;

            i++;
        }
        return arr;
    }


    public static int[][] input2dArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("plese enter  size of row :");
        int row = input.nextInt();
        System.out.print("plese enter  size of column :");
        int col = input.nextInt();

        int[][] arr = new  int[row][col];


        int i=0;
        while(i< row){
            int j=0;
            while(j<col){
                System.out.print("eneter array elements of rows :" +(i+1)+  ", Column : "+(j+1)+ ":");
                arr[i][j] = input.nextInt();
                        j++;
            }
            i++;
        }
        return arr;
    }





    public static int displayarr(int[] arr){

        int i=0;

        while(i< arr.length){
            System.out.print(arr[i] +" ");
            i++;
        }
return 0;
    }

}
