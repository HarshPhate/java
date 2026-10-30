package in.Multithreading;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NeedofMultithreading {
    public static void main(String[] args) {
     long start =   System.currentTimeMillis();
       //Task 1
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println();
        //Task 2
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println();
        //TAsk 3
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println();
        long end = System.currentTimeMillis();

        System.out.printf("total tine :%d",  end - start);
        }
    }
