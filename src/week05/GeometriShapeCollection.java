package week05;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometriShapeCollection implements ShapeCollection{
    private ArrayList<GeometricObject> shapeList;
    private int numObject;

    public GeometriShapeCollection(int listLength){
        this.numObject = listLength;
        shapeList = new ArrayList<GeometricObject>();
    }

    @Override
    public void addShape(GeometricObject shape) {
        if(shapeList.size() < numObject){
            shapeList.add(shape);
        }else {
            System.out.println("No more space in the list");
        }
    }

    @Override
    public void printShapeList() {
        for(int i = 0; i <shapeList.size(); i++){
            if(shapeList.get(i).getShape().equals("Circle")){
                System.out.println("Shape = circle, Area = " + shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            } else if (shapeList.get(i).getShape().equals("Rectangle")) {
                System.out.println("Shape = Rectangle, Area = " + shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }else{
                System.out.println("Shape = Square, Area = " + shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }
        }
    }

    @Override
    public boolean runMenu() {
        boolean exit = false;

        System.out.println("To add a new shape press 1");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");

        Scanner scan = new Scanner(System.in);
        int choise = scan.nextInt();

        switch (choise){
            case 1:
                System.out.println("Press 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");

                int choise2 = scan.nextInt();
                scan.nextLine();

                System.out.println("Enter the color of your shape");
                String colour = scan.nextLine();

                System.out.println("Is it filled? (y/n)");
                String isFilled = scan.nextLine();
                boolean filled = false;

                if(isFilled.equals("y"))
                    filled = true;
                else if (isFilled.equals("n"))
                    filled = false;
                else
                    System.out.println("Please enter y or n, if the shape is filled or not respectively");

                switch (choise2){
                    case 1:
                        System.out.println("Insert the radius");
                        double radius = scan.nextDouble();
                        Circle c = new Circle(radius, filled, colour);
                        addShape(c);
                        break;
                    case 2:
                        System.out.println("Insert the length");
                        double length = scan.nextDouble();
                        System.out.println("Insert the width");
                        double width = scan.nextDouble();
                        Rectangle r = new Rectangle(width, length, colour, filled);
                        addShape(r);
                        break;
                    case 3:
                        System.out.println("Insert the side");
                        double side = scan.nextDouble();
                        Square s = new Square(side, colour, filled);
                        addShape(s);
                        break;
                }
                break;
            case 2:
                this.printShapeList();
                break;
            case 3:
                exit = true;
                break;
        }
        return exit;
    }

    public static void main(String[] args){
        ShapeCollection sys = new GeometriShapeCollection(10);
        boolean exit = false;

        while (!exit){
            exit = sys.runMenu();
        }
    }
}
