import java.util.Scanner;

class circle {

    double radiudsinMM ;

    circle(double radiudsinMM){
        this.radiudsinMM = radiudsinMM;
    }

    double circumfernceOfCircle(){
        return 2*radiudsinMM*Math.PI;
    }

    double getarea(){
        return Math.PI * Math.pow(radiudsinMM,2);
    }

     @Override
     public String toString() {
         return "circumfernceOfCircle of circle "+ circumfernceOfCircle()+
                 " area of circle "+ getarea();
     }

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("enter a radius :");
         double radius = input.nextInt();
     circle cur = new circle(radius);
     cur.circumfernceOfCircle();
     cur.getarea();
     System.out.print(cur);
     }
}
