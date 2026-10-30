package in.my.Polymorphism.objReference;

public class Car implements Vehicle {

    public int noOfdoors(){
        return 5;
    }


    @Override
    public void start() {
        System.out.println("Car is start");
    }
}
