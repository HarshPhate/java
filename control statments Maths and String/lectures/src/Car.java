public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String modelNO;
    String company;
    String Name;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String modelNO, String company,  String Name) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.modelNO = modelNO;
        this.company = company;
        this.Name = Name;
    }

//    @Override
//    public String toString() {
//        return "My car name is: "+ Name ;
//    }


    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", modelNO='" + modelNO + '\'' +
                ", company='" + company + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Car{");
//        sb.append("noOfWheels=").append(noOfWheels);
//        sb.append(", noOfDoors=").append(noOfDoors);
//        sb.append(", maxSpeed=").append(maxSpeed);
//        sb.append(", modelNO='").append(modelNO).append('\'');
//        sb.append(", company='").append(company).append('\'');
//        sb.append(", Name='").append(Name).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }

    public static void main(String[] args) {
    Car swift = new Car(4,4,120, "kkgg", "carcompany", "Swift");
    System.out.print(swift);  //toString likhne ki jarurat nahi hai kyuki ,toString is implicit ,agar ami kisi bhi object ko print karne ke kosish karu to bydefolt system out toString apply ho jata hai ;
    }
}
