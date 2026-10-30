import java.util.Scanner;

public class Switch_case {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.print("Week dectator");
        System.out.print("enter a dy no :");
        int day = input.nextInt();


//      oldSwitch(day);
      newSwitch(day);

    }

    public static void newSwitch(int day){
       String dayStr = switch(day){
           case 1 ->  "Monday" ;
           case 2 ->  "tuesday" ;
           case 3 ->  "wednesday" ;
           case 4->  "thursday" ;
           case 5 ->  "friday" ;
           case 6 ,7->  "holiday" ;
           default -> "Invalid ";

       };

       System.out.print(dayStr);
    }

    public static void oldSwitch(int day){

        switch(day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                // Fall through
            case 7:
                System.out.print("Holiday");
                break;
            default:
                System.out.print("Invilad number");
                break;

        }
    }
}
