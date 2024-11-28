package week05;
public abstract class GeometricObject{
    protected String color;
    protected boolean filled;

    public GeometricObject(){}

    public GeometricObject(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract String getShape();


}