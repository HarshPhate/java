package in.my.abstraction;

public abstract class Vehicle implements Transport{

    private int noOfTires;



    public abstract void makeStartSound();              //abstarct method

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public void getsetho() {
        System.out.println("lets go...");
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }


    public void commute() {
        System.out.println("going");
    }
}
