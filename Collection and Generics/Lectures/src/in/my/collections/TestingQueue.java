package in.my.collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Hrsh");
        queue.offer("string");


        Utilitu.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());
        queue.remove();
        queue.poll();

//        System.out.println(queue.remove());
        System.out.println(queue.poll());

        Utilitu.print(queue);

    }
}
