package in.my.abstraction;

public class Car extends Vehicle{

private int noOfdoors;


    public Car() {              //har child ko apne parent ka constructor call karna padta hai
        super(4);      //isko bolte hai constructor chaining
    }

    @Override                       //a notation
    public void makeStartSound() {
        System.out.println("brhumm.....");
    }
}
