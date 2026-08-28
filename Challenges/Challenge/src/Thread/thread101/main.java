package Thread.thread101;

public class main {
    public static void main(String[] args) throws InterruptedException {
        createthread t1 = new createthread(1);
        createthread t2 = new createthread(2);
        createthread t3 = new createthread(3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
