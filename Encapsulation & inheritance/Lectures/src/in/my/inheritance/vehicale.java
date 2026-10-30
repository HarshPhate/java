package in.my.inheritance;

public class vehicale {
    protected int noOfvheels;

    public void setnoOfvheels(int noOfvheels){
        this.noOfvheels = noOfvheels;
    }


    @Override
    public String toString() {
        return  "No of Vheels :"+ noOfvheels;
    }

    public void commute(){
        System.out.printf("I am going for place a and place b with %d tires \n", noOfvheels);
    }
}
