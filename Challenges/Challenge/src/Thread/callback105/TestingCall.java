package Thread.callback105;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingCall {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            callthread task = new callthread(i);
            list.add(service.submit(task));

        }

        for (Future<Integer> integerFuture : list) {
            System.out.printf("\nResult is :%d", integerFuture.get());
        }

        if(!service.awaitTermination(10,TimeUnit.SECONDS)){
            System.out.println("bass");
        service.shutdownNow();
        }


    }
}
