package in.my.varargs;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(sum(3,5));
//        System.out.println(sum(new int[]{4,3}));
        System.out.println(sum(1,3,4,4));
    }

    public static int sum(int... a){
        int sum = 0;

        for (int i : a) {
            sum += i;
        }
        return sum;
    }

//    public static int sum(int[] a){
//        int sum =0;
//
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

    public static int sum(int a , int b){
        return a+b;
    }
}
