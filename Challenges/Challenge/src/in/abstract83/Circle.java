package in.abstract83;

public class Circle extends Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return   Math.PI *Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radius=").append(calculateArea());
        sb.append('}');
        return sb.toString();
    }


}
