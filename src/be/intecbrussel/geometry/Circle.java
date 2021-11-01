package be.intecbrussel.geometry;

public class Circle extends Shape {
    public final int ANGLES = 0;
    private int count;
    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(Circle c) {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {

        return (radius * radius) * Math.PI;

    }

    public double getPerimeter() {

        return 2* (radius*Math.PI);
    }

    public void grow(int d) {

    }
    public int getCount(){

        return count;
    }

}
