package in.my.ENUMS;

public enum trafficlight {
    RED("stop"), GREEN("go"), YELLOW("start") ;

    private final String action;

    trafficlight(String action) {
        this.action = action;
    }
}
