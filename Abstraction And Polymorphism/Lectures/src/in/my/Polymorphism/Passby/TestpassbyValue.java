package in.my.Polymorphism.Passby;

public class TestpassbyValue {
    public static void main(String[] args) {
     int x = 3;
     int y = 4;

    int sum = add(x,y);
        System.out.printf("x = %d y=%d sum =%d",x,y,sum);
    }


    public static int add(int a ,int b){
//        return a+b;

        a +=b;

        return a;
    }


}
