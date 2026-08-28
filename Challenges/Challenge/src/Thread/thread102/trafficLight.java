package Thread.thread102;

public enum trafficLight {

    Red(9000),
    Yello(5000),
    Green(4000);


    private final int timemill;


    trafficLight(int timemill) {
        this.timemill = timemill;
    }

    public int getTimemill() {
        return timemill;
    }
}
