package Thread.thread101;

public class createthread extends Thread{

    private final int tno ;

    public createthread(int tno){
        this.tno = tno;
    }

    @Override
    public void run() {
        System.out.printf("\n %s Thread started %d",Thread.currentThread().getName(), tno);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\n %s Thread Ended %d",Thread.currentThread().getName(), tno);
    }
}
