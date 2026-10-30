package in.Multithreading;

import in.Multithreading.Runnable.PrintClass;

public class TestingPriority {
    public static void main(String[] args) {
        PrintClass P1 = new PrintClass('*');
        PrintClass P2 = new PrintClass('$');
        PrintClass P3 = new PrintClass('#');

        Thread t1 = new Thread(P1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new Thread(P2);
        t2.setPriority(Thread.MAX_PRIORITY);

        t2.start();
        Thread t3 = new Thread(P3);
        t3.setPriority(Thread.NORM_PRIORITY);

        t3.start();

        System.out.println();
        System.out.printf(" %s :",
                Thread.currentThread().getName());
    }

}
