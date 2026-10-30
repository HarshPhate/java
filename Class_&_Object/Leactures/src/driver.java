public class driver {

    static int  minAgeDriving = 18;

    String name;
    String dateOfLicense;
    int age;

    public boolean isAllowedToDrive(){
        return this.age >= minAgeDriving;
    }

    public static void main(String[] arg){

//         car mycar = new car();        //new means object  creation
//        mycar.addfuel(6);
//        mycar.drive();
//        System.out.print(mycar.currentFuelinLiters);

        car swift = new car( "red");
//        swift.addfuel(6);
        swift.start().drive();
        System.out.print(swift.color);


//        driver mydriver = new driver();            //name of class , name of obj, =  keyword , constructor().
//        mydriver.dateOfLicense =" 1/jan/2015";
//        mydriver.isAllowedToDrive();
//        System.out.println(minAgeDriving);

    }



}
