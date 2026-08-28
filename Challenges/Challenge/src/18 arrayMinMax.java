 class arrayMinMax {
    public static void main(String[] atg){
    int[] arr = arrayutility.inputarray();

    int min = min(arr);
    System.out.println("minimun of the array is :" +min);
    int max = max(arr);
    System.out.println("maximun of the array is :" +max);
    }

    public static int min(int[] arr){

        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        int i = 0;
        int min = arr[0];

        while(i <arr.length){
            if(min> arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }


      public static int max(int[] arr){

        if(arr.length  == 0){
         return Integer.MIN_VALUE;
        }

          int i=0;
          int max = arr[0];

          while(i < arr.length){
              if(max < arr[i]){
                  max = arr[i];
              }
              i++;
          }

        return max;
    }


}
