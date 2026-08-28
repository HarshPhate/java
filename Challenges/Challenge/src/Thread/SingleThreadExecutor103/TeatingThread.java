package Thread.SingleThreadExecutor103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TeatingThread {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {      //This is abest try to write SingleThreadExecutor

            Threadexecutor task = new Threadexecutor();

            service.submit(task);

//            service.shutdown();
        }
    }
}
