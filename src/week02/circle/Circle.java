package week02.circle;

public class Circle {
    private String color;
    private double radius;

    public Circle(){
        radius = 1;
        color = "Blue";
    }

    public Circle(double r){
        radius = r;
        color = "Blue";
    }

    public Circle (double r, String c){
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }


    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Circle {" +
                "radius =" + radius+
                ", color =" + color+
                ", area =" + getArea()+
                "}";
    }
}
