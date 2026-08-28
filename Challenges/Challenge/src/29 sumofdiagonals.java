 class sumofdiagonals {
    public static void main(String[] arg){
        int[][] arr = arrayutility.input2dArray();

           for(int i=0; i<arr.length; i++){
               for(int j=0; j<arr.length; j++){
                   System.out.print(arr[i][j] + " ");
               }
               System.out.println();
           }

        int sumright = sumofRightDiagonal(arr);
        System.out.print(sumright);


        System.out.println();



        int sumleft = sumofLeftDiagonal(arr);
        System.out.print(sumleft);



    }


    public static int sumofRightDiagonal(int[][] arr){
        int i=0;
        int sum =0;

        while(i< arr.length){
            int col = arr.length-1-i;

            sum += arr[i][col];
           i++;
        }
        return sum;
    }

    public static int sumofLeftDiagonal(int[][] arr){
        int i=0;
        int sum =0;
        int col =0 ;
      while(i<arr.length){

          sum +=arr[i][col];
          i++;
          col++;
      }
      return sum;
    }
}
