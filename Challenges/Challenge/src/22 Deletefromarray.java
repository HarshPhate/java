import java.util.Scanner;

class Deletefromarray {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int[] arr = arrayutility.inputarray();
        System.out.println ("Enter a number you want delete :");
        int deletenum = input.nextInt();

int[] newArr = deltete(arr, deletenum);
System.out.println("Here is my new array ");
       arrayutility.displayarr(newArr);


    }

    public static int[] deltete(int[] arr, int num){

       int occ = OccurencesArray.Occurences(arr, num);

       if(occ ==0){
           return arr;
       }

       int newSizee = arr.length- occ;

       int[] newarr = new int[newSizee];

       int i=0, j=0;

       while(i< arr.length){
           if(arr[i] != num){
               newarr[j] = arr[i];
               j++;
           }
           i++;
       }
       return newarr;
    }
}
