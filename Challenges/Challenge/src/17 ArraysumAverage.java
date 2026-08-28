 class ArraysumAverage {
    public static void main(String[] arrg ){
            int[] input = arrayutility.inputarray();

            long sum = sum(input);
            System.out.println("Sum of the array is :" +sum);

            int  average = average(input);
            System.out.print("average of the array is :" +average);

    }


    public static int sum(int[] input){

        int sum = 0;
        int i=0;

        while(i< input .length){
            sum += input[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] input){
      int length = input.length;
      int sum = sum(input);

      int average = sum / length;

        return average;
    }
}
