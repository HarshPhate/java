package in.Multithreading.synchronize;

public class Counter {
    private int count =1;

    public synchronized void increment(){
        count++;
    }

    public int getcount(){
        return count;
    }
}
