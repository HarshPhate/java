 class sumANDaverage2Darray {
    public static void main(String[] arg){
        int [][] arr= arrayutility.input2dArray();

        int sum = sum(arr);
        System.out.println("Sum of the array is :" +sum);

        double average = average(arr);
        System.out.print("Average of the array is :" +average);


    }


    public static int sum(int[][] arr){
        int i=0,  sum=0;

        while(i<arr.length){
           int j=0;
            while(j<arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }



    public static double average(int[][] arr){

        if(arr.length == 0){
            return 0;
        }
        int row = arr.length;
        int col = arr[0].length;
        int sum = sum(arr);
        double size = row *col;

        double average;

        average = sum / size;

        return average;
    }
}
