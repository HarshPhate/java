package challenge110;

public class Testingfunc {
        public static void main(String[] args) {
            funcInterface isprime = num ->{

                for(int i =2 ; i< num; i++){
                    if(num % i == 0){
                        return false;
                    }
                }
                return true;
            };


            System.out.println(isprime.iscandite(5));

        }
}
