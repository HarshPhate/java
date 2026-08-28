import java.util.*;

class UniqueCharacter {
     public static void main(String[] args) {
         Set<Character> unique = new HashSet<>();

         Scanner input = new Scanner(System.in);
         System.out.println("Please enter a String :");

         String userStr = input.next();

         for (char ch : userStr.toCharArray()){
             unique.add(ch);
         }

         System.out.println(unique);
         System.out.println(unique.size());

     }
}
