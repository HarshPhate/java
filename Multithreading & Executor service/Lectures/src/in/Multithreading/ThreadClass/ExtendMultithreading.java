package in.Multithreading.ThreadClass;

public class ExtendMultithreading {
    public static void main(String[] args) {
     long start =   System.currentTimeMillis();
       FirstTask F1 = new FirstTask();
       SecondTask S2 = new SecondTask();
       ThirdTask T3 = new ThirdTask();

        System.out.println("\n first start");
       F1.start();
        System.out.println("\n second start");
       S2.start();
        System.out.println("\n Third start");
       T3.start();

        long end = System.currentTimeMillis();
        System.out.println();
        System.out.printf(" %s total tine :%d ",
                Thread.currentThread().getName(),
                end - start);
        }
    }
