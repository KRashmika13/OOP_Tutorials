package week04.exercise1;

import week02.circle.Circle;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){

    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * getRadius() * height ) + (2 * super.getArea());
    }

    public String toString(){
        return "cylinder: sub class of "
                + super.toString()
                + " height= " + height;
    }
}
