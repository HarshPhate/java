import java.util.Scanner;

public class doWhile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("please enetr your age :");
//        int age = input.nextInt();
//
//        while(age <0 || age > 100){
//            System.out.print("please enetr your age :");
//            age = input.nextInt();
//        }

        int age;

        do{
            System.out.print("please enetr your age :");
            age = input.nextInt();

        }while(age <0 || age > 100);

        System.out.print(" your age is :" + age);

    }
}
