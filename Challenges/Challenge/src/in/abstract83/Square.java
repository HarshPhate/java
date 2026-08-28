package in.abstract83;

public class Square extends Shape{

    double sideincm;

    public Square(double sideincm) {
        this.sideincm = sideincm;
    }

    @Override
    public double calculateArea() {
        return  sideincm*sideincm;
    }
}
