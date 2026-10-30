package in.Executor.Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
         ExecutorService service= Executors.newFixedThreadPool(3);

         FetchName task1 = new FetchName("Harsh");
         FetchName task2 = new FetchName("naru");
         FetchName task3 = new FetchName("siddu");
         FetchName task4 = new FetchName("sufi");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\nfull name :%s", name1.get());
        System.out.printf("\nfull name : %s", name2.get());
        System.out.printf("\nfull name : %s", name3.get());
        System.out.printf("\nfull name : %s", name4.get());

        service.shutdown();
    }
}
