public class car {
    int noOfWheels;
    String color;

    float maxSpeed;
    float currentFuelinLiters;

    int noOfSeat;

    car(String color){
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelinLiters = 6;
        noOfSeat = 5;
    }

    car(){
        this.color = "black";        //when you call anthor constrructor ,this must be a first statement inour constructor
        currentFuelinLiters = 5;      //
    }

    public  car start(){
        if(currentFuelinLiters ==0 ){
            System.out.println("car is out if fuel");
        } else if(currentFuelinLiters < 5) {
            System.out.println("Car is inn reversse mode  ,please refuel ");
            currentFuelinLiters--;
        }else{
            System.out.println("Car id driving..... bruhhhhh");

        }
        return this;
    }

    public void drive(){

        currentFuelinLiters--;

    }

    public void addfuel(float fuel){
        currentFuelinLiters +=fuel ;
    }

}
