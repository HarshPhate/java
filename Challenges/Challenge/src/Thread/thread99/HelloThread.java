package Thread.thread99;

public class HelloThread extends Thread{

    private final int  Tno ;

    public HelloThread(int Tno) {
        this.Tno = Tno;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello rom Thread "+ Tno + Thread.currentThread().getName());
        }

    }
}
