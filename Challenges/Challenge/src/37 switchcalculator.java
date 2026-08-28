import java.util.Scanner;

class switchcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number :");
        int first = input.nextInt();
        System.out.print("enter second number :");
        int sec = input.nextInt();

        System.out.println("1: Addition") ;
        System.out.println("2: Substraction") ;
        System.out.println("3: divide") ;
        System.out.println("4: Multiply") ;
        System.out.println("Choose operator :") ;
        int num = input.nextInt();


        operator(first , sec ,num);

    }

    public static void operator(int first ,int sec, int num) {

        String result = switch (num){
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "%";
            case 4 -> "*";
            default -> "invalid" ;
        };
        System.out.print(first + num + sec);
    }
}
