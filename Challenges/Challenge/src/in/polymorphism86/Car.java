package in.polymorphism86;

public class Car extends Vehicle{

    @Override
    public void Service() {
        super.Service();
        System.out.println("Car need to service");
    }
}
