package in.my.Wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
//        Integer first = new Integer(55);    //worng syntax

//        Integer first = Integer.valueOf("fj");   //1: right way and you can pass any type of data

        Integer first = 5;                      //2; you can also pass like this , because automatic
        System.out.println(first);
        int sec = first;                     //this is called unboxing
    }
}
