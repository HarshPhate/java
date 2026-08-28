package Thread.thread100;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Threadstate t1 = new Threadstate();
        System.out.printf("\ncreated the thread %s:", t1.getState());
        t1.start();

        t1.join();
        System.out.printf("\nThread finished %s", t1.getState());

    }
}
