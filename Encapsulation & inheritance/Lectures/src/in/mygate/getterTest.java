package in.mygate;

import in.getterSetter.car;



public class getterTest {

   public static void main(String[] args) {

   car mycar = new car("red", "bmw", 3, 5000 );

   mycar.setColor("yellow");

   System.out.printf("%s %s", mycar.getcolor(), mycar.getModel());
   }
}
