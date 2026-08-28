package Thread.thread99;

public class TetsingHelloThread {
    public static void main(String[] args) throws InterruptedException {
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        t1.start();
        t1.join();
        t2.start();
        t2.run();
    }
}
