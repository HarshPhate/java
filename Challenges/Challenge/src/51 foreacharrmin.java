 class foreacharrmin {
     public static void main(String[] args) {
         int[] arr = arrayutility.inputarray();

         int max = Integer.MIN_VALUE;
         for(int num : arr){
              if(max < num){
                  max= num ;
              }
         }
         System.out.print("Max value in array "+ max);

     }
}
