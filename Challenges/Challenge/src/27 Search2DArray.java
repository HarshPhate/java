import java.util.Scanner;

class Search2DArray {
    public static void main(String[] arg){
        Scanner input  = new Scanner(System.in);
        System.out.print("Welcome to  2D  Array :");
        int[][] arr= arrayutility.input2dArray();
        System.out.print("enter a number you want to search :");
        int num = input.nextInt();

        search(arr, num);





    }

    public static int[][] search(int[][] arr, int num){
        int i,j ,k;

        for(i=0; i<arr.length; i++){
            for(j=0; j<arr.length; j++){
                if(arr[i][j]== num){
                    System.out.print("this " +num+ " number found at "+arr[i][j]+ " postion");

                }
            }
        }
        return arr;
    }
}
