 class CheckPlindromeArray {
    public static void main(String[] arg){
        int[] arr = arrayutility.inputarray();


       boolean rev = reverse(arr);

        if(rev){
            System.out.println("this  is  pilndrome ");

        }else{
            System.out.println("this is not plindrome");

        }



    }

    public static boolean reverse(int[] arr){
        int i=0;



        while(i < arr.length/2) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
            i++;
        }
           return true;

    }
}
