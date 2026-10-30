package in.my.Polymorphism.overriding;


public class TestAbstraction {



    public static void main(String[] args) {
//        in.my.Polymorphism.SuperKeyword.Car c = new in.my.Polymorphism.SuperKeyword.Car();
//        Vehicle v = new Vehicle();
        Car C = new Car(4);
        Plane p = new Plane();

        C.Start();
        p.Start();

    }
}
