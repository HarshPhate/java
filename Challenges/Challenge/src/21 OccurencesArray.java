import java.util.Scanner;

class OccurencesArray {

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int[] arr = arrayutility.inputarray();

        System.out.print ("Enter a number you want :");
        int num = input.nextInt();

        int count  = Occurences(arr, num);

        System.out.print ("this number exits "+count+ "times in array");


    }

    public static int Occurences(int[] arr, int num){
        int i =0;
        int count = 0;

        while(i <arr.length){
            if(arr[i] == num){
                count++;
            }
            i++;
        }
    return count;
    }
}
