package in.my;

public class AccessTest {
    public static void main(String[] args) {
        car Car = new car();
        Car.color ="Red";
        Car.model = "swift";
        Car.costofPurchase = 673;

        System.out.println(Car);
        car mycar = new car("black", "bmw", 5000, 5);

        System.out.print(mycar);



        Default def = new Default();
    }
}
