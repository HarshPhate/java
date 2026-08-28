 class diceRoll {

    int roll(){
        double random = Math.random()* 6;
        return (int) Math.ceil(random);
    }
     public static void main(String[] args) {

        diceRoll dice = new diceRoll();

         for (int i = 1; i < 10; i++) {

             System.out.println(dice.roll());
         }
     }
}
