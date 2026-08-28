package in.inheri82;

public class ArrayOperations {
    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

      class stastic{


        double mean(){
            double sum =0;
            for(int ele : arr){
                sum += ele;
            }

            return (double) sum / arr.length;
        }
    }
}
