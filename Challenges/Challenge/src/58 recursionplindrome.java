import java.util.Scanner;

class recursionplindrome {
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         System.out.print("enter a number :");
         String num = input.next();

         System.out.print("your string is "+((pilondrome(num))? " plindrome" : "Not plindrome"));
     }

    public static boolean pilondrome(String num) {
         if(num.length() <= 1){
             return true;
         }

         int lastpos = num.length()-1;
         if(num.charAt(0) != num.charAt(lastpos) ){
             return false;
         }

         String newstr = num.substring(1, lastpos);


        return pilondrome(newstr);
    }
}
