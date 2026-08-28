 class reverseArray {
    public static void main(String[] arg){
        int[] arr = arrayutility.inputarray();
        reverse(arr);

        System.out.print("reverse array ");
        arrayutility.displayarr(arr);

    }

    public static int reverse(int[] arr){
        int i= 0;

        while(i< arr.length/2){
       int swap = arr[i];
       arr[i] = arr[(arr.length-1)-i];
       arr[(arr.length-1)-i] = swap;
            i++;
        }
        return arr[i];
    }
}
