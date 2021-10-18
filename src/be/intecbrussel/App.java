package be.intecbrussel;

import be.intecbrussel.geometry.Rectangle;

public class App {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
//        myRectangle.setLength(-10);
//        myRectangle.setWidth(5);

        Rectangle mySquare = new Rectangle(7);
        mySquare.setLength(3);
        mySquare.setWidth(3);

        double rect1Length = myRectangle.getLength();
        double rect2Length = mySquare.getLength();
        double rect1Width = myRectangle.getWidth();
        double rect2Width = mySquare.getWidth();

        System.out.println("Rectangle1: " + rect1Length + " " + rect1Width);
        System.out.println("Rectangle2: " + rect2Length + " " + rect2Width);

        double rect1Area = myRectangle.getArea();
        double rect1Circumference = myRectangle.getCircumference();
        System.out.println("Rectangle1: Area: " + rect1Area + " Circ.: " + rect1Circumference);
    }
}
