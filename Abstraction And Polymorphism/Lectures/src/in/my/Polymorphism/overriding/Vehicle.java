package in.my.Polymorphism.overriding;

public abstract class Vehicle {

    private int noOfTires;

    Vehicle(){
        this.noOfTires = 0;
    }

    Vehicle(int noOfTires){
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires(){
        return this.noOfTires;
    }


    public  void Start(){
        System.out.println("vehicle is starting....");
    };


}
