package in.my.ENUMS;

public class Testing {


    public static void main(String[] args) {
        trafficlight color = trafficlight.RED;

        color = trafficlight.YELLOW;

//        Geade grade = Geade.A;

        Geade grade = Geade.valueOf("D");

        for (Geade value : Geade.values()) {
            System.out.println(value);
        }
    }

}
