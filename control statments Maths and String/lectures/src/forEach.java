public class forEach {
    public static void main(String[] args) {
      String[] arr = new String[]{
         "apple", "banana", "mango" , "jamun"
        };

        printarr(arr);
        printforEach(arr);
    }

    public static void printforEach(String[] arr) {
        for(String name : arr){
            System.out.println(name);
        }

    }

    public static void printarr(String[] arr) {
      for(int i= 0; i< arr.length-1; i++){
          System.out.println(arr[i]);
      }
    }
}
