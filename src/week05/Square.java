package week05;

public class Square extends GeometricObject{
    protected double side;

    public Square(){}

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getShape() {
        return "Square";
    }
}
