package Thread.thread102;

public class signalThread extends Thread{

    private final trafficLight color ;

    public signalThread(trafficLight color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("\n This is %s signal",color);
        try {
            Thread.sleep(color.getTimemill());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("\n%s is inactive", color);


    }


}
