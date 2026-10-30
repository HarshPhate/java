package in.my.inheritance;

import in.my.Towheelers;

public class MotorCycle extends Towheelers {

   protected double petrolCapcity;

    public MotorCycle(double petrolCapcity) {
        this.petrolCapcity = petrolCapcity;
    }

    public void start(){
        System.out.println("Starting");
    }
}
