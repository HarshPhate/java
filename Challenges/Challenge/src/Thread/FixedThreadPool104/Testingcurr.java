package Thread.FixedThreadPool104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Testingcurr {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(2)) {

            for (int i = 1; i <10; i++) {
                currthreadname task = new currthreadname();
                service.submit(task);
            }

         if(service.awaitTermination(10, TimeUnit.SECONDS)){
             service.shutdownNow();
         }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
