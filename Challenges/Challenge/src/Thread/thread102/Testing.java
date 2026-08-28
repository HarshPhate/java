package Thread.thread102;

public class Testing {

    public static void main(String[] args) throws InterruptedException {
        signalThread s1 = new signalThread(trafficLight.Red);
        signalThread s2 = new signalThread(trafficLight.Yello);
        signalThread s3 = new signalThread(trafficLight.Green);

        s1.start();
        s1.join();

        s2.start();
        s2.join();

        s3.start();
        s3.join();
    }

}
