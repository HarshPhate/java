package in.Executor;

 public class PrintClass implements Runnable{

     @Override
     public void run() {
         for (int i = 1; i <100 ; i++) {
             try {
                 Thread.sleep(50);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             System.out.printf( "%d%c ",i ,targetcahr);
         }

         System.out.printf("\n %s  %c Task complete ",
                 Thread.currentThread().getName(),targetcahr);


     }
     private final char targetcahr;

     public PrintClass(char targetcahr){
         this.targetcahr = targetcahr;
     }

 }
