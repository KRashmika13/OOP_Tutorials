package week05;

public class Circle extends GeometricObject{
    protected double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, boolean filled, String color){
        super(color, filled);
        this.radius =radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getShape() {
        return "Circle";
    }
}
