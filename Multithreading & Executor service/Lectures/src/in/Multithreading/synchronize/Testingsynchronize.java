package in.Multithreading.synchronize;

public class Testingsynchronize {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Counter  c1 = new Counter();

        UpdateThread t1 = new UpdateThread(c1);
        UpdateThread t2 = new UpdateThread(c1);




        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();

        System.out.printf("Final count :%d , Time taken :%d", c1.getcount(),
                (end-start));
    }
}
