import java.util.Scanner;

 class SwitchcaseMOnthyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter month nomber :");
        int Month = input.nextInt();

        MonthOfYear(Month);
    }


    public static void MonthOfYear(int month){

        String output = switch (month){
            case 1 -> "Jan" ;
            case 2 -> "feb" ;
            case 3 -> "march" ;
            case 4 -> "april" ;
            case 5 -> "june" ;
            case 6 -> "july" ;
            case 7 -> "august" ;
            case 8 -> "sep" ;
            case 9 -> "Nov" ;
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };

        System.out.print(output);
    }
}

