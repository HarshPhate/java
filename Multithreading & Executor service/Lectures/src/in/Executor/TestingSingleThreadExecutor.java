package in.Executor;

import in.Multithreading.Runnable.PrintClass;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();    //for single Thread

        PrintClass task1 = new PrintClass('*');
        PrintClass task2 = new PrintClass('$');
        PrintClass task3 = new PrintClass('#');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();

    }
}
