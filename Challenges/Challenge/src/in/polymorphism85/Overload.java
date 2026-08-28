package in.polymorphism85;

public class Overload {
    public int add(int a , int b){
        return a+ b;
    }

    public int add(int a , int b, int c){
        return a+ b + c;
    }

    public double add(double a , double b){
        return a+ b;
    }


    public static void main(String[] args) {

        Overload over = new Overload();

        int x = 5;
        int y = 6;
//        over.add(x,y);

        System.out.println(over.add(4,6));
        System.out.println(over.add(4,6,7));
        System.out.println(over.add(4.6,5.8));


    }
}
