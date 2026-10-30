package in.Multithreading.Runnable;

public class TestingRunnable {
    public static void main(String[] args) {
        PrintClass P1 = new PrintClass('*');
        PrintClass P2 = new PrintClass('$');
        PrintClass P3 = new PrintClass('#');

        Thread t1 = new Thread(P1);
        t1.start();
        Thread t2 = new Thread(P2);
        t2.start();
        Thread t3 = new Thread(P3);
        t3.start();

        System.out.println();
        System.out.printf(" %s :",
                Thread.currentThread().getName());
    }

}
