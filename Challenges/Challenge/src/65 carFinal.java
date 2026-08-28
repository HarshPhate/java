 class carFinal {

    final int NoofWheels;
    final String Model;
    final String name;


    carFinal(int NoofWheels, String Model, String name ){
        this.Model = Model;
        this.NoofWheels = NoofWheels;
        this.name = name;
    }


     public static void main(String[] args) {
         carFinal car = new carFinal(4, "4k2","swift" );

         System.out.print(car.name);
     }

}
