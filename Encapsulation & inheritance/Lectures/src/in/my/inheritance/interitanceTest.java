package in.my.inheritance;

import in.my.Towheelers;

public class interitanceTest {
    public static void main(String[] args) {
        vehicale Vehicale = new vehicale();
       Vehicale.commute();
        System.out.println(Vehicale.toString());
        System.out.println(Vehicale.hashCode());
        System.out.println(Vehicale.hashCode());
        System.out.println(Vehicale.hashCode());
        System.out.println(Vehicale.getClass());


        Towheelers Tow = new Towheelers();
       Tow.commute();
       Tow.balance();


        MotorCycle motorCycle = new MotorCycle(4);

        motorCycle.balance();
        motorCycle.commute();
        motorCycle.start();

        System.out.println(motorCycle.petrolCapcity);

    }
}
