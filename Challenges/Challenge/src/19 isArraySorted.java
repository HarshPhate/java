 class isArraySorted {
    public static void main(String[] arg){
        int[] arr = arrayutility.inputarray();
        boolean isInnc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);


        if(isInnc || isDec){
            System.out.print("your array  is sorted ");
        }else{
            System.out.print("your array  is not sorted ");

        }
    }

    public static boolean isIncreasing(int[] arr){

        int i = 1;

        while(i< arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

     public static boolean isDecreasing(int[] arr){

        int i = 1;

        while(i< arr.length){
        if(arr[i] > arr[i-1]){
            return false;

        }
            i++;
        }
        return true;
    }
}

