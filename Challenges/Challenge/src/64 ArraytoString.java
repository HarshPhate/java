 class ArraytoString {
     public static void main(String[] args) {
         String[] arr = new String[] {"this", "is" ,"a", "new" ,"string" ,"Builder"};

         StringBuilder sb = new StringBuilder();
         for(String str : arr){

         sb.append(str).append(" ");
         }

         System.out.print(sb);
     }
}
