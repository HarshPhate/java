import java.util.Scanner;

class gessNo {

    long random(){
        return (int) (Math.ceil(Math.random()* 10));
    }

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         gessNo gen = new gessNo();

         long result = gen.random();

        int num;
         do{
             System.out.print("Enter a number :");
              num = input.nextInt();

              if(num == result){
                  System.out.println("you guess coo=rrect ");
              } else if (num > result) {
                  System.out.println("guess lower no ");
              }else{
                  System.out.println("guess higher ");
              }

         } while(num != result);


     }
}
