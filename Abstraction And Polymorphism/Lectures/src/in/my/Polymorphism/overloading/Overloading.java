package in.my.Polymorphism.overloading;

public class Overloading {

    Overloading(){
        System.out.println("default constructor");
    }

    Overloading(String pop){
        System.out.println(pop);
    }

    public int add(int a, int b){
        return a+b;
    }

    public String add(String a, String b){                  //Method overloading
        return a+b;
    }

    public int add(int a, int b, int c, int d){             //Method overloading
        return a+b+c+d;
    }


    public static void main(String[] args) {
        Overloading over = new Overloading();

        int a = over.add(2,3);
        String b = over.add("a", "b");

        System.out.println(a);
    }
}
