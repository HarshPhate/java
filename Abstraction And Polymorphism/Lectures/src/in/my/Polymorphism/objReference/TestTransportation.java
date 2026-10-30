package in.my.Polymorphism.objReference;


public class TestTransportation {

    public static void main(String[] args) {
        Car c = new Car();
//        Vehicle v = new Vehicle();

//        CastTest(v);
        CastTest(c);


        Vehicle Vcar = new Car();
        Vcar.start();
//
//        Car c = (Car) new Vehicle();



//        Object ref = new Vehicle();          //objec ke reference me aap kisi ko bhi dal skte hai because object sabka parent hai
    }

    private static void CastTest(Vehicle veh){
//        Car CV = (Car) veh;
//        veh.noOfdoors();
//        ((Car) veh).noOfdoors();
//        veh.start();
//        CV.noOfdoors();

        veh.start();

        if(veh instanceof Car){           //iske andar aap tabhi ja sakte hai jab vehical ka actual obj aaya hai wo car ka obi ho

        }


    }
}
