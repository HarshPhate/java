package Thread.callback105;

import java.io.PrintStream;
import java.util.concurrent.Callable;

public class callthread implements Callable<Integer> {

    private final int num;

    public callthread(int num){
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        int result = fact(num);
        return result;
    }

    public int fact(int num){
        int fact =1;

        for (int i = fact; i < num; i++) {
            fact *= i;
        }

        return fact;
    }


}
