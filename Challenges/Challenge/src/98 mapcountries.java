import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class mapcountries {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a country name :");
        String cou = input.next();



        System.out.printf(" %s : %s ", cou, cap(cou));
    }

    public static String cap(String country){
        Map<String, String > countries = new HashMap<>();

        countries.put("India", "New Delhi");
        countries.put("USA", "Washington, D.C.");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");
        countries.put("Australia", "Canberra");


        return countries.get(country);

    }
}
