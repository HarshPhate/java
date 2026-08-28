 class Varargs {


         public static void main(String[] args) {
             System.out.println(concenate("gagws"));
             System.out.println(concenate("gagws", "iufgimv", "ijncfjincj"));
         }

         public static String concenate(String... a){

          StringBuilder sb = new StringBuilder();
             for (String add: a){
                sb.append(add).append(" ");
             }

             return sb.toString();
         }
     }
