package be.intecbrussel.geometry;

import jdk.swing.interop.SwingInterOpUtils;

public abstract class ShapeApp extends Shape {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle (4,3);
        myRectangle.setX(5);
        myRectangle.setY(4);

        Rectangle mySquare = new Rectangle (7,7);
        mySquare.setX(8);
        mySquare.setY(8);

        double rect1Length = myRectangle.getX();
        double rect2Length = mySquare.getX();
        double rect1Width = myRectangle.getY();
        double rect2Width = mySquare.getY();

        System.out.println("Rectangle1: " + rect1Length + " " + rect1Width);
        System.out.println("Rectangle2: " + rect2Length + " " + rect2Width);

        double rect1Area = myRectangle.getArea();
        double rect1Perimeter = myRectangle.getPerimeter();
        System.out.println("Rectangle: Area: " + rect1Area + " Perimeter: " + rect1Perimeter);

        Triangle myTriangle = new Triangle (3,4,4);
        myTriangle.setX(5);
        myTriangle.setY(8);

        double triangleLength = myTriangle.getX();
        double triangleHeight = myTriangle.getY();

        System.out.println("Triangle: " + triangleLength + triangleHeight);

        double triangleArea = myTriangle.getArea();
        double trianglePerimeter = myTriangle.getPerimeter();
        double trianglePerpendicular = myTriangle.getPerpendicular();
        System.out.println("Triangle: Area: " + triangleArea + "Perimeter: " + trianglePerimeter);


        Circle myCircle = new Circle (4);
        myCircle.setX(4);
        myCircle.setY(3);

        double circleRadius = myCircle.getRadius();

        System.out.println("Circle: Radius: " + circleRadius);

        double circleArea = myCircle.getArea();
        double circlePerimeter = myCircle.getPerimeter();

        System.out.println("Circle: Area: " + circleArea + "Perimeter: " + circlePerimeter );

    }


}
