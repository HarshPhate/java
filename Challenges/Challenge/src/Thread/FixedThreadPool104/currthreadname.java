package Thread.FixedThreadPool104;

public class currthreadname implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        double random = Math.floor(((Math.random()*5)*1000));
        try {
            Thread.sleep((long) random);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
