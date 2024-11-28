package week02.circle;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        System.out.println();

        Circle c2 = new Circle(8);
        System.out.println("The " + c2.getColor() + " circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println();

        Circle c3 = new Circle(7, "Red");
        System.out.println("The " + c3.getColor() + " circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());
        System.out.println(c3);

    }
}
