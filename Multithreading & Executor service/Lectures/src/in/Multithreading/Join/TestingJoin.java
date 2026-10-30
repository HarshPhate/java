package in.Multithreading.Join;

import in.Multithreading.Runnable.PrintClass;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        PrintClass P1 = new PrintClass('*');
        PrintClass P2 = new PrintClass('$');
        PrintClass P3 = new PrintClass('#');

        Thread t1 = new Thread(P1);
        t1.start();
        System.out.println("\nThread 1 started");
        Thread t2 = new Thread(P2);
        t2.start();
        System.out.println("\nThread 2 started");

        t1.join();
        System.out.println("\nThread 3 started");
        Thread t3 = new Thread(P3);
        t3.start();

        System.out.println();
        System.out.printf(" %s :",
                Thread.currentThread().getName());
    }

}
